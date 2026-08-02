package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huz {
    public static final huz a;
    public static final Set b;
    private static final /* synthetic */ huz[] c;

    static {
        huz huzVar = new huz();
        a = huzVar;
        c = new huz[]{huzVar};
        b = new CopyOnWriteArraySet();
    }

    private huz() {
    }

    public static huz[] values() {
        return (huz[]) c.clone();
    }
}
