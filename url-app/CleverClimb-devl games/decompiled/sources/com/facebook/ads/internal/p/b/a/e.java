package com.facebook.ads.internal.p.b.a;

import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
abstract class e implements com.facebook.ads.internal.p.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f5313a = Executors.newSingleThreadExecutor();

    private class a implements Callable<Void> {

        /* renamed from: b, reason: collision with root package name */
        private final File f5315b;

        public a(File file) {
            this.f5315b = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            e.this.b(this.f5315b);
            return null;
        }
    }

    e() {
    }

    private void a(List<File> list) {
        long b2 = b(list);
        int size = list.size();
        for (File file : list) {
            if (!a(file, b2, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    b2 -= length;
                    Log.i("ProxyCache", "Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    Log.e("ProxyCache", "Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }

    private long b(List<File> list) {
        Iterator<File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().length();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(File file) {
        d.c(file);
        a(d.b(file.getParentFile()));
    }

    @Override // com.facebook.ads.internal.p.b.a.a
    public void a(File file) {
        this.f5313a.submit(new a(file));
    }

    protected abstract boolean a(File file, long j, int i);
}
