package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ev {
    public static final ev f;
    public static final ev g;
    public static final ev h;
    public static final ev i;
    public static final /* synthetic */ ev[] j;

    static {
        ev evVar = new ev("NONE", 0);
        f = evVar;
        ev evVar2 = new ev("START", 1);
        g = evVar2;
        ev evVar3 = new ev("END", 2);
        h = evVar3;
        ev evVar4 = new ev("BOTH", 3);
        i = evVar4;
        j = new ev[]{evVar, evVar2, evVar3, evVar4};
    }

    public static ev valueOf(String str) {
        return (ev) Enum.valueOf(ev.class, str);
    }

    public static ev[] values() {
        return (ev[]) j.clone();
    }
}
