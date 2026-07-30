package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.location.BDLocation;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;

    @Nullable
    private List<Cue> cues;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;

    @Nullable
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, SerialTrans.MTU_MAX, FAUEnum.PR_TIMEOUT, GpsTrainingDaoProxy.GPS_TYPE, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, DfuAdapter.ConnectState.REQUEST_MTU, PsExtractor.PRIVATE_STREAM_1, 191, 8482, BDLocation.TypeServerDecryptError, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);
    private int currentChannel = 0;

    private static final class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final List<CueStyle> cueStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final StringBuilder captionStringBuilder = new StringBuilder();

        private static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i8, boolean z7, int i9) {
                this.style = i8;
                this.underline = z7;
                this.start = i9;
            }
        }

        public CueBuilder(int i8, int i9) {
            reset(i8);
            this.captionRowCount = i9;
        }

        private SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i8 = 0;
            int i9 = -1;
            int i10 = -1;
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            boolean z7 = false;
            while (i8 < this.cueStyles.size()) {
                CueStyle cueStyle = this.cueStyles.get(i8);
                boolean z8 = cueStyle.underline;
                int i14 = cueStyle.style;
                if (i14 != 8) {
                    boolean z9 = i14 == 7;
                    if (i14 != 7) {
                        i13 = Cea608Decoder.STYLE_COLORS[i14];
                    }
                    z7 = z9;
                }
                int i15 = cueStyle.start;
                i8++;
                if (i15 != (i8 < this.cueStyles.size() ? this.cueStyles.get(i8).start : length)) {
                    if (i9 != -1 && !z8) {
                        setUnderlineSpan(spannableStringBuilder, i9, i15);
                        i9 = -1;
                    } else if (i9 == -1 && z8) {
                        i9 = i15;
                    }
                    if (i10 != -1 && !z7) {
                        setItalicSpan(spannableStringBuilder, i10, i15);
                        i10 = -1;
                    } else if (i10 == -1 && z7) {
                        i10 = i15;
                    }
                    if (i13 != i12) {
                        setColorSpan(spannableStringBuilder, i11, i15, i12);
                        i12 = i13;
                        i11 = i15;
                    }
                }
            }
            if (i9 != -1 && i9 != length) {
                setUnderlineSpan(spannableStringBuilder, i9, length);
            }
            if (i10 != -1 && i10 != length) {
                setItalicSpan(spannableStringBuilder, i10, length);
            }
            if (i11 != length) {
                setColorSpan(spannableStringBuilder, i11, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i8, int i9, int i10) {
            if (i10 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i10), i8, i9, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i8, int i9) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i8, i9, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i8, int i9) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i8, i9, 33);
        }

        public void append(char c8) {
            if (this.captionStringBuilder.length() < 32) {
                this.captionStringBuilder.append(c8);
            }
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.cueStyles.get(size);
                    int i8 = cueStyle.start;
                    if (i8 != length) {
                        return;
                    }
                    cueStyle.start = i8 - 1;
                }
            }
        }

        @Nullable
        public Cue build(int i8) {
            float f8;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i9 = 0; i9 < this.rolledUpCaptions.size(); i9++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i9));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i10 = this.indent + this.tabOffset;
            int length = (32 - i10) - spannableStringBuilder.length();
            int i11 = i10 - length;
            if (i8 == Integer.MIN_VALUE) {
                i8 = (this.captionMode != 2 || (Math.abs(i11) >= 3 && length >= 0)) ? (this.captionMode != 2 || i11 <= 0) ? 0 : 2 : 1;
            }
            if (i8 != 1) {
                if (i8 == 2) {
                    i10 = 32 - length;
                }
                f8 = ((i10 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f8 = 0.5f;
            }
            int i12 = this.row;
            if (i12 > 7) {
                i12 -= 17;
            } else if (this.captionMode == 1) {
                i12 -= this.captionRowCount - 1;
            }
            return new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i12, 1).setPosition(f8).setPositionAnchor(i8).build();
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i8) {
            this.captionMode = i8;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildCurrentLine());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int min = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= min) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionMode(int i8) {
            this.captionMode = i8;
        }

        public void setCaptionRowCount(int i8) {
            this.captionRowCount = i8;
        }

        public void setStyle(int i8, boolean z7) {
            this.cueStyles.add(new CueStyle(i8, z7, this.captionStringBuilder.length()));
        }
    }

    public Cea608Decoder(String str, int i8, long j8) {
        this.validDataChannelTimeoutUs = j8 > 0 ? j8 * 1000 : -9223372036854775807L;
        this.packetLength = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i8 == 1) {
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else if (i8 == 2) {
            this.selectedChannel = 1;
            this.selectedField = 0;
        } else if (i8 == 3) {
            this.selectedChannel = 0;
            this.selectedField = 1;
        } else if (i8 != 4) {
            Log.w(TAG, "Invalid channel. Defaulting to CC1.");
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else {
            this.selectedChannel = 1;
            this.selectedField = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C.TIME_UNSET;
    }

    private static char getBasicChar(byte b8) {
        return (char) BASIC_CHARACTER_SET[(b8 & Byte.MAX_VALUE) - 32];
    }

    private static int getChannel(byte b8) {
        return (b8 >> 3) & 1;
    }

    private List<Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        ArrayList arrayList = new ArrayList(size);
        int i8 = 2;
        for (int i9 = 0; i9 < size; i9++) {
            Cue build = this.cueBuilders.get(i9).build(Integer.MIN_VALUE);
            arrayList.add(build);
            if (build != null) {
                i8 = Math.min(i8, build.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            Cue cue = (Cue) arrayList.get(i10);
            if (cue != null) {
                if (cue.positionAnchor != i8) {
                    cue = (Cue) Assertions.checkNotNull(this.cueBuilders.get(i10).build(i8));
                }
                arrayList2.add(cue);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b8) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b8 & 31];
    }

    private static char getExtendedPtDeChar(byte b8) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b8 & 31];
    }

    private static char getExtendedWestEuropeanChar(byte b8, byte b9) {
        return (b8 & 1) == 0 ? getExtendedEsFrChar(b9) : getExtendedPtDeChar(b9);
    }

    private static char getSpecialNorthAmericanChar(byte b8) {
        return (char) SPECIAL_CHARACTER_SET[b8 & 15];
    }

    private void handleMidrowCtrl(byte b8) {
        this.currentCueBuilder.append(' ');
        this.currentCueBuilder.setStyle((b8 >> 1) & 7, (b8 & 1) == 1);
    }

    private void handleMiscCode(byte b8) {
        if (b8 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b8 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b8) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i8 = this.captionMode;
                if (i8 != 0) {
                    if (b8 == 33) {
                        this.currentCueBuilder.backspace();
                        break;
                    } else {
                        switch (b8) {
                            case 44:
                                this.cues = Collections.emptyList();
                                int i9 = this.captionMode;
                                if (i9 == 1 || i9 == 3) {
                                    resetCueBuilders();
                                    break;
                                }
                            case 45:
                                if (i8 == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b8, byte b9) {
        int i8 = ROW_INDICES[b8 & 7];
        if ((b9 & 32) != 0) {
            i8++;
        }
        if (i8 != this.currentCueBuilder.row) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.row = i8;
        }
        boolean z7 = (b9 & 16) == 16;
        boolean z8 = (b9 & 1) == 1;
        int i9 = (b9 >> 1) & 7;
        this.currentCueBuilder.setStyle(z7 ? 8 : i9, z8);
        if (z7) {
            this.currentCueBuilder.indent = COLUMN_INDICES[i9];
        }
    }

    private static boolean isCtrlCode(byte b8) {
        return (b8 & 224) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b8, byte b9) {
        return (b8 & 246) == 18 && (b9 & 224) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b8, byte b9) {
        return (b8 & a4.a.f60l2) == 17 && (b9 & 240) == 32;
    }

    private static boolean isMiscCode(byte b8, byte b9) {
        return (b8 & 246) == 20 && (b9 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b8, byte b9) {
        return (b8 & 240) == 16 && (b9 & 192) == 64;
    }

    private static boolean isRepeatable(byte b8) {
        return (b8 & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z7, byte b8, byte b9) {
        if (!z7 || !isRepeatable(b8)) {
            this.repeatableControlSet = false;
        } else {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b8 && this.repeatableControlCc2 == b9) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b8;
            this.repeatableControlCc2 = b9;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b8) {
        return (b8 & 246) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b8, byte b9) {
        return (b8 & a4.a.f60l2) == 17 && (b9 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b8, byte b9) {
        return (b8 & a4.a.f60l2) == 23 && b9 >= 33 && b9 <= 35;
    }

    private static boolean isXdsControlCode(byte b8) {
        return 1 <= b8 && b8 <= 15;
    }

    private void maybeUpdateIsInCaptionService(byte b8, byte b9) {
        if (isXdsControlCode(b8)) {
            this.isInCaptionService = false;
            return;
        }
        if (isServiceSwitchCommand(b8)) {
            if (b9 != 32 && b9 != 47) {
                switch (b9) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b9) {
                            case 42:
                            case 43:
                                this.isInCaptionService = false;
                                break;
                        }
                }
            }
            this.isInCaptionService = true;
        }
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i8) {
        int i9 = this.captionMode;
        if (i9 == i8) {
            return;
        }
        this.captionMode = i8;
        if (i8 == 3) {
            for (int i10 = 0; i10 < this.cueBuilders.size(); i10++) {
                this.cueBuilders.get(i10).setCaptionMode(i8);
            }
            return;
        }
        resetCueBuilders();
        if (i9 == 3 || i8 == 1 || i8 == 0) {
            this.cues = Collections.emptyList();
        }
    }

    private void setCaptionRowCount(int i8) {
        this.captionRowCount = i8;
        this.currentCueBuilder.setCaptionRowCount(i8);
    }

    private boolean shouldClearStuckCaptions() {
        return (this.validDataChannelTimeoutUs == C.TIME_UNSET || this.lastCueUpdateUs == C.TIME_UNSET || getPositionUs() - this.lastCueUpdateUs < this.validDataChannelTimeoutUs) ? false : true;
    }

    private boolean updateAndVerifyCurrentChannel(byte b8) {
        if (isCtrlCode(b8)) {
            this.currentChannel = getChannel(b8);
        }
        return this.currentChannel == this.selectedChannel;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    protected Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle((List) Assertions.checkNotNull(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void decode(SubtitleInputBuffer subtitleInputBuffer) {
        boolean z7;
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
        this.ccData.reset(byteBuffer.array(), byteBuffer.limit());
        boolean z8 = false;
        while (true) {
            int bytesLeft = this.ccData.bytesLeft();
            int i8 = this.packetLength;
            if (bytesLeft < i8) {
                break;
            }
            int readUnsignedByte = i8 == 2 ? -4 : this.ccData.readUnsignedByte();
            int readUnsignedByte2 = this.ccData.readUnsignedByte();
            int readUnsignedByte3 = this.ccData.readUnsignedByte();
            if ((readUnsignedByte & 2) == 0 && (readUnsignedByte & 1) == this.selectedField) {
                byte b8 = (byte) (readUnsignedByte2 & 127);
                byte b9 = (byte) (readUnsignedByte3 & 127);
                if (b8 != 0 || b9 != 0) {
                    boolean z9 = this.isCaptionValid;
                    if ((readUnsignedByte & 4) == 4) {
                        boolean[] zArr = ODD_PARITY_BYTE_TABLE;
                        if (zArr[readUnsignedByte2] && zArr[readUnsignedByte3]) {
                            z7 = true;
                            this.isCaptionValid = z7;
                            if (!isRepeatedCommand(z7, b8, b9)) {
                                if (this.isCaptionValid) {
                                    maybeUpdateIsInCaptionService(b8, b9);
                                    if (this.isInCaptionService && updateAndVerifyCurrentChannel(b8)) {
                                        if (!isCtrlCode(b8)) {
                                            this.currentCueBuilder.append(getBasicChar(b8));
                                            if ((b9 & 224) != 0) {
                                                this.currentCueBuilder.append(getBasicChar(b9));
                                            }
                                        } else if (isSpecialNorthAmericanChar(b8, b9)) {
                                            this.currentCueBuilder.append(getSpecialNorthAmericanChar(b9));
                                        } else if (isExtendedWestEuropeanChar(b8, b9)) {
                                            this.currentCueBuilder.backspace();
                                            this.currentCueBuilder.append(getExtendedWestEuropeanChar(b8, b9));
                                        } else if (isMidrowCtrlCode(b8, b9)) {
                                            handleMidrowCtrl(b9);
                                        } else if (isPreambleAddressCode(b8, b9)) {
                                            handlePreambleAddressCode(b8, b9);
                                        } else if (isTabCtrlCode(b8, b9)) {
                                            this.currentCueBuilder.tabOffset = b9 - 32;
                                        } else if (isMiscCode(b8, b9)) {
                                            handleMiscCode(b9);
                                        }
                                        z8 = true;
                                    }
                                } else if (z9) {
                                    resetCueBuilders();
                                    z8 = true;
                                }
                            }
                        }
                    }
                    z7 = false;
                    this.isCaptionValid = z7;
                    if (!isRepeatedCommand(z7, b8, b9)) {
                    }
                }
            }
        }
        if (z8) {
            int i9 = this.captionMode;
            if (i9 == 1 || i9 == 3) {
                this.cues = getDisplayCues();
                this.lastCueUpdateUs = getPositionUs();
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    protected boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j8) {
        super.setPositionUs(j8);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() {
        SubtitleOutputBuffer availableOutputBuffer;
        SubtitleOutputBuffer dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.cues = Collections.emptyList();
        this.lastCueUpdateUs = C.TIME_UNSET;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }
}
