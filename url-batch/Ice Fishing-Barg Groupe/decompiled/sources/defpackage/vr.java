package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vr {
    public static final vr OPXfSBeufaJ8;
    public static final vr rtx2ld2ELZv4;
    public static final /* synthetic */ vr[] wdg6QnbFHrFF;

    static {
        vr vrVar = new vr("VIEW_APPEAR", 0);
        rtx2ld2ELZv4 = vrVar;
        vr vrVar2 = new vr("VIEW_DISAPPEAR", 1);
        OPXfSBeufaJ8 = vrVar2;
        wdg6QnbFHrFF = new vr[]{vrVar, vrVar2};
    }

    public static vr valueOf(String str) {
        return (vr) Enum.valueOf(vr.class, str);
    }

    public static vr[] values() {
        return (vr[]) wdg6QnbFHrFF.clone();
    }
}
