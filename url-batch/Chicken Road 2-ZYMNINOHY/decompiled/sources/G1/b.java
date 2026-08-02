package G1;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final class b implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f833a;

    public b(String str) {
        this.f833a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f833a);
    }
}
