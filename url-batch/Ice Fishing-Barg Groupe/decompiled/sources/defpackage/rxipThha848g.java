package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rxipThha848g extends yQRudnv4La6p {
    public static final VzNxmvWisHL1 Companion = new VzNxmvWisHL1();
    public static rxipThha848g TSizfFm2Yiuu;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // defpackage.yQRudnv4La6p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] OPXfSBeufaJ8(int i) {
        int length = TSizfFm2Yiuu().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && TSizfFm2Yiuu().charAt(i - 1) == '\n' && !wdg6QnbFHrFF(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (TSizfFm2Yiuu().charAt(i2) == '\n' || (i2 != 0 && TSizfFm2Yiuu().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return lS5Rgt96tfkO(i2, i);
    }

    @Override // defpackage.yQRudnv4La6p
    public final int[] PxuCJdSBwIXG(int i) {
        int length = TSizfFm2Yiuu().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && TSizfFm2Yiuu().charAt(i) == '\n' && (TSizfFm2Yiuu().charAt(i) == '\n' || (i != 0 && TSizfFm2Yiuu().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !wdg6QnbFHrFF(i2)) {
            i2++;
        }
        return lS5Rgt96tfkO(i, i2);
    }

    public final boolean wdg6QnbFHrFF(int i) {
        if (i <= 0 || TSizfFm2Yiuu().charAt(i - 1) == '\n') {
            return false;
        }
        return i == TSizfFm2Yiuu().length() || TSizfFm2Yiuu().charAt(i) == '\n';
    }
}
