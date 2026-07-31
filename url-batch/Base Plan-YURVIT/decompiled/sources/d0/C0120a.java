package d0;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120a implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1808a;

    public C0120a(String str) {
        this.f1808a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f1808a);
    }
}
