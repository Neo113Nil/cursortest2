package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i8) {
            return new SpliceScheduleCommand[i8];
        }
    };
    public final List<Event> events;

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        /* JADX INFO: Access modifiers changed from: private */
        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }

        private ComponentSplice(int i8, long j8) {
            this.componentTag = i8;
            this.utcSpliceTime = j8;
        }
    }

    static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(readUnsignedByte);
        for (int i8 = 0; i8 < readUnsignedByte; i8++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            this.events.get(i9).writeToParcel(parcel);
        }
    }

    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j8, boolean z7, boolean z8, boolean z9, List<ComponentSplice> list, long j9, boolean z10, long j10, int i8, int i9, int i10) {
            this.spliceEventId = j8;
            this.spliceEventCancelIndicator = z7;
            this.outOfNetworkIndicator = z8;
            this.programSpliceFlag = z9;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j9;
            this.autoReturn = z10;
            this.breakDurationUs = j10;
            this.uniqueProgramId = i8;
            this.availNum = i9;
            this.availsExpected = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            ArrayList arrayList;
            boolean z7;
            long j8;
            boolean z8;
            long j9;
            int i8;
            int i9;
            int i10;
            boolean z9;
            boolean z10;
            long j10;
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            boolean z11 = (parsableByteArray.readUnsignedByte() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z11) {
                arrayList = arrayList2;
                z7 = false;
                j8 = C.TIME_UNSET;
                z8 = false;
                j9 = C.TIME_UNSET;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                z9 = false;
            } else {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                boolean z12 = (readUnsignedByte & 128) != 0;
                boolean z13 = (readUnsignedByte & 64) != 0;
                boolean z14 = (readUnsignedByte & 32) != 0;
                long readUnsignedInt2 = z13 ? parsableByteArray.readUnsignedInt() : C.TIME_UNSET;
                if (!z13) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(readUnsignedByte2);
                    for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z14) {
                    long readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z15 = (128 & readUnsignedByte3) != 0;
                    j10 = ((((readUnsignedByte3 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z10 = z15;
                } else {
                    z10 = false;
                    j10 = C.TIME_UNSET;
                }
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                z9 = z13;
                i10 = parsableByteArray.readUnsignedByte();
                j9 = j10;
                arrayList = arrayList2;
                long j11 = readUnsignedInt2;
                i8 = readUnsignedShort;
                i9 = readUnsignedByte4;
                j8 = j11;
                boolean z16 = z12;
                z8 = z10;
                z7 = z16;
            }
            return new Event(readUnsignedInt, z11, z7, z9, arrayList, j8, z8, j9, i8, i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i8 = 0; i8 < size; i8++) {
                this.componentSpliceList.get(i8).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        private Event(Parcel parcel) {
            this.spliceEventId = parcel.readLong();
            this.spliceEventCancelIndicator = parcel.readByte() == 1;
            this.outOfNetworkIndicator = parcel.readByte() == 1;
            this.programSpliceFlag = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 < readInt; i8++) {
                arrayList.add(ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = Collections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            arrayList.add(Event.createFromParcel(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }
}
