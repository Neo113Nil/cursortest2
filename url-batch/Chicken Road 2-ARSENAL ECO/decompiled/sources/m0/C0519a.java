package m0;

import android.content.Context;
import java.io.File;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0519a f5326a = new C0519a();

    public final File a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.i.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
