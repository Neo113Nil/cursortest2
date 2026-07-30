package j$.time.zone;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[d.values().length];
        a = iArr;
        try {
            iArr[d.UTC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[d.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
