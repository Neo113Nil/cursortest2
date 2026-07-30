package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i8) {
            return new SpliceInsertCommand[i8];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }

        private ComponentSplice(int i8, long j8, long j9) {
            this.componentTag = i8;
            this.componentSplicePts = j8;
            this.componentSplicePlaybackPositionUs = j9;
        }
    }

    static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j8, TimestampAdjuster timestampAdjuster) {
        List list;
        boolean z7;
        boolean z8;
        long j9;
        boolean z9;
        long j10;
        int i8;
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        long j11;
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        boolean z12 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z12) {
            list = emptyList;
            z7 = false;
            z8 = false;
            j9 = C.TIME_UNSET;
            z9 = false;
            j10 = C.TIME_UNSET;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            z10 = false;
        } else {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            boolean z13 = (readUnsignedByte & 128) != 0;
            boolean z14 = (readUnsignedByte & 64) != 0;
            boolean z15 = (readUnsignedByte & 32) != 0;
            boolean z16 = (readUnsignedByte & 16) != 0;
            long parseSpliceTime = (!z14 || z16) ? C.TIME_UNSET : TimeSignalCommand.parseSpliceTime(parsableByteArray, j8);
            if (!z14) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(readUnsignedByte2);
                for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    long parseSpliceTime2 = !z16 ? TimeSignalCommand.parseSpliceTime(parsableByteArray, j8) : C.TIME_UNSET;
                    arrayList.add(new ComponentSplice(readUnsignedByte3, parseSpliceTime2, timestampAdjuster.adjustTsTimestamp(parseSpliceTime2)));
                }
                emptyList = arrayList;
            }
            if (z15) {
                long readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                boolean z17 = (128 & readUnsignedByte4) != 0;
                j11 = ((((readUnsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z11 = z17;
            } else {
                z11 = false;
                j11 = C.TIME_UNSET;
            }
            i8 = parsableByteArray.readUnsignedShort();
            z10 = z14;
            i9 = parsableByteArray.readUnsignedByte();
            i10 = parsableByteArray.readUnsignedByte();
            list = emptyList;
            long j12 = parseSpliceTime;
            z9 = z11;
            j10 = j11;
            z8 = z16;
            z7 = z13;
            j9 = j12;
        }
        return new SpliceInsertCommand(readUnsignedInt, z12, z7, z10, z8, j9, timestampAdjuster.adjustTsTimestamp(j9), list, z9, j10, i8, i9, i10);
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.programSplicePts + ", programSplicePlaybackPositionUs= " + this.programSplicePlaybackPositionUs + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            this.componentSpliceList.get(i9).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j8, boolean z7, boolean z8, boolean z9, boolean z10, long j9, long j10, List<ComponentSplice> list, boolean z11, long j11, int i8, int i9, int i10) {
        this.spliceEventId = j8;
        this.spliceEventCancelIndicator = z7;
        this.outOfNetworkIndicator = z8;
        this.programSpliceFlag = z9;
        this.spliceImmediateFlag = z10;
        this.programSplicePts = j9;
        this.programSplicePlaybackPositionUs = j10;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z11;
        this.breakDurationUs = j11;
        this.uniqueProgramId = i8;
        this.availNum = i9;
        this.availsExpected = i10;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
