package V0;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final class a implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2747a;

    public a(String str) {
        this.f2747a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f2747a);
    }
}
