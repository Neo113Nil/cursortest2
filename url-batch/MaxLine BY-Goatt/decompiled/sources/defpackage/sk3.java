package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum sk3 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String m;

    sk3(String str) {
        this.m = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.m;
    }
}
