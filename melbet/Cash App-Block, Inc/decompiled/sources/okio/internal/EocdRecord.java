package okio.internal;

/* loaded from: classes9.dex */
public final class EocdRecord {
    public final /* synthetic */ int $r8$classId;
    public long centralDirectoryOffset;
    public long entryCount;

    public EocdRecord() {
        this.$r8$classId = 2;
        this.entryCount = -9223372036854775807L;
        this.centralDirectoryOffset = -9223372036854775807L;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                return this.entryCount + "/" + this.centralDirectoryOffset;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ EocdRecord(long j, long j2, int i, byte b) {
        this.$r8$classId = i;
        this.entryCount = j;
        this.centralDirectoryOffset = j2;
    }

    public EocdRecord(int i, long j, long j2) {
        this.$r8$classId = 0;
        this.entryCount = j;
        this.centralDirectoryOffset = j2;
    }
}
