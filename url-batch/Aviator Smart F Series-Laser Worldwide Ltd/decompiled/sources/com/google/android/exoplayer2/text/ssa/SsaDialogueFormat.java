package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Ascii;

@Deprecated
/* loaded from: classes3.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i8, int i9, int i10, int i11, int i12) {
        this.startTimeIndex = i8;
        this.endTimeIndex = i9;
        this.styleIndex = i10;
        this.textIndex = i11;
        this.length = i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public static SsaDialogueFormat fromFormatLine(String str) {
        char c8;
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), SystemInfoUtil.COMMA);
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < split.length; i12++) {
            String lowerCase = Ascii.toLowerCase(split[i12].trim());
            lowerCase.hashCode();
            switch (lowerCase.hashCode()) {
                case 100571:
                    if (lowerCase.equals("end")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3556653:
                    if (lowerCase.equals("text")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 109780401:
                    if (lowerCase.equals(TtmlNode.TAG_STYLE)) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    i9 = i12;
                    break;
                case 1:
                    i11 = i12;
                    break;
                case 2:
                    i8 = i12;
                    break;
                case 3:
                    i10 = i12;
                    break;
            }
        }
        if (i8 == -1 || i9 == -1 || i11 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i8, i9, i10, i11, split.length);
    }
}
