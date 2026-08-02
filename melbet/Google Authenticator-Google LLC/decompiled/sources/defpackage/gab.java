package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gab implements FilenameFilter {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gab(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            fzz fzzVar = (fzz) obj;
            return fzy.a(str, ".db", fzzVar.b, fzzVar.c);
        }
        gac gacVar = (gac) obj;
        return fzy.a(str, ":Singleton.db", gacVar.c, gacVar.d);
    }
}
