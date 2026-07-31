package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
class j implements w.c {

    /* renamed from: f, reason: collision with root package name */
    private final Context f1341f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1342g;

    /* renamed from: h, reason: collision with root package name */
    private final File f1343h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1344i;

    /* renamed from: j, reason: collision with root package name */
    private final w.c f1345j;

    /* renamed from: k, reason: collision with root package name */
    private a f1346k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1347l;

    j(Context context, String str, File file, int i7, w.c cVar) {
        this.f1341f = context;
        this.f1342g = str;
        this.f1343h = file;
        this.f1344i = i7;
        this.f1345j = cVar;
    }

    private void b(File file) {
        ReadableByteChannel channel;
        if (this.f1342g != null) {
            channel = Channels.newChannel(this.f1341f.getAssets().open(this.f1342g));
        } else {
            if (this.f1343h == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f1343h).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f1341f.getCacheDir());
        createTempFile.deleteOnExit();
        v.d.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void h() {
        String databaseName = getDatabaseName();
        File databasePath = this.f1341f.getDatabasePath(databaseName);
        a aVar = this.f1346k;
        v.a aVar2 = new v.a(databaseName, this.f1341f.getFilesDir(), aVar == null || aVar.f1246j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    b(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e7) {
                    throw new RuntimeException("Unable to copy database file.", e7);
                }
            }
            if (this.f1346k == null) {
                aVar2.c();
                return;
            }
            try {
                int c7 = v.c.c(databasePath);
                int i7 = this.f1344i;
                if (c7 == i7) {
                    aVar2.c();
                    return;
                }
                if (this.f1346k.a(c7, i7)) {
                    aVar2.c();
                    return;
                }
                if (this.f1341f.deleteDatabase(databaseName)) {
                    try {
                        b(databasePath);
                    } catch (IOException e8) {
                        Log.w("ROOM", "Unable to copy database file.", e8);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.c();
                return;
            } catch (IOException e9) {
                Log.w("ROOM", "Unable to read database version.", e9);
                aVar2.c();
                return;
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // w.c
    public synchronized w.b I() {
        if (!this.f1347l) {
            h();
            this.f1347l = true;
        }
        return this.f1345j.I();
    }

    @Override // w.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1345j.close();
        this.f1347l = false;
    }

    void f(a aVar) {
        this.f1346k = aVar;
    }

    @Override // w.c
    public String getDatabaseName() {
        return this.f1345j.getDatabaseName();
    }

    @Override // w.c
    public void setWriteAheadLoggingEnabled(boolean z6) {
        this.f1345j.setWriteAheadLoggingEnabled(z6);
    }
}
