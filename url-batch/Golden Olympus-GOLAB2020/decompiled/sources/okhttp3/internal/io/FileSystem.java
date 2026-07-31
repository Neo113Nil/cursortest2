package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.B;
import okio.p;
import okio.q;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public interface FileSystem {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f43087a = Companion.f43089a;

    /* renamed from: b, reason: collision with root package name */
    public static final FileSystem f43088b = new Companion.SystemFileSystem();

    @Metadata
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f43089a = new Companion();

        @Metadata
        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public B a(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return p.j(file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public z b(File file) {
                z g4;
                z g5;
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    g5 = q.g(file, false, 1, null);
                    return g5;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    g4 = q.g(file, false, 1, null);
                    return g4;
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void c(File directory) {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        c(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean d(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void e(File from, File to) {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                f(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void f(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public z g(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return p.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return p.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long h(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    B a(File file);

    z b(File file);

    void c(File file);

    boolean d(File file);

    void e(File file, File file2);

    void f(File file);

    z g(File file);

    long h(File file);
}
