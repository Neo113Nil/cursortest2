package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class v {
    public static final v ALWAYS;
    public static final v EXCEEDS_PAD;
    public static final v NEVER;
    public static final v NORMAL;
    public static final v NOT_NEGATIVE;
    public static final /* synthetic */ v[] a;

    static {
        v vVar = new v("NORMAL", 0);
        NORMAL = vVar;
        v vVar2 = new v("ALWAYS", 1);
        ALWAYS = vVar2;
        v vVar3 = new v("NEVER", 2);
        NEVER = vVar3;
        v vVar4 = new v("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = vVar4;
        v vVar5 = new v("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = vVar5;
        a = new v[]{vVar, vVar2, vVar3, vVar4, vVar5};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) a.clone();
    }
}
