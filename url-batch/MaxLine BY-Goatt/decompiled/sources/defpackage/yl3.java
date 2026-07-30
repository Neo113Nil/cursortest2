package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum yl3 implements mn3 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);

    public final int m;

    yl3(int i) {
        this.m = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }

    @Override // defpackage.mn3
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        lh.e("Can't get the number of an unknown enum value.");
        return 0;
    }
}
