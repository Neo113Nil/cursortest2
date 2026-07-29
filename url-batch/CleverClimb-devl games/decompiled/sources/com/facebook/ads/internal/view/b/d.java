package com.facebook.ads.internal.view.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.q.a.v;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class d extends AsyncTask<String, Void, Bitmap[]> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f5551b = "d";

    /* renamed from: a, reason: collision with root package name */
    public boolean f5552a;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f5553c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5554d;
    private final WeakReference<ImageView> e;
    private final WeakReference<b> f;
    private final WeakReference<ViewGroup> g;
    private e h;
    private int i;
    private int j;

    public d(ViewGroup viewGroup, int i) {
        this.f5552a = false;
        this.i = -1;
        this.j = -1;
        this.f5553c = new WeakReference<>(viewGroup.getContext());
        this.f = null;
        this.e = null;
        this.g = new WeakReference<>(viewGroup);
        this.f5554d = i;
    }

    public d(ImageView imageView) {
        this.f5552a = false;
        this.i = -1;
        this.j = -1;
        this.f5553c = new WeakReference<>(imageView.getContext());
        this.f = null;
        this.e = new WeakReference<>(imageView);
        this.g = null;
        this.f5554d = 0;
    }

    public d(b bVar) {
        this.f5552a = false;
        this.i = -1;
        this.j = -1;
        this.f5553c = new WeakReference<>(bVar.getContext());
        this.f = new WeakReference<>(bVar);
        this.e = null;
        this.g = null;
        this.f5554d = 0;
    }

    public d a() {
        this.i = -1;
        this.j = -1;
        return this;
    }

    public d a(int i, int i2) {
        this.i = i;
        this.j = i2;
        return this;
    }

    public d a(e eVar) {
        this.h = eVar;
        return this;
    }

    public d a(boolean z) {
        this.f5552a = z;
        return this;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        executeOnExecutor(THREAD_POOL_EXECUTOR, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Bitmap[] bitmapArr) {
        b bVar;
        ImageView imageView;
        if (this.e != null && (imageView = this.e.get()) != null) {
            imageView.setImageBitmap(bitmapArr[0]);
        }
        if (this.f != null && (bVar = this.f.get()) != null) {
            bVar.a(bitmapArr[0], bitmapArr[1]);
        }
        if (this.g != null && this.g.get() != null) {
            v.a(this.g.get(), new BitmapDrawable(this.f5553c.get().getResources(), bitmapArr[1]));
        }
        if (this.h != null) {
            this.h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(6:6|7|8|9|(1:40)(1:13)|14)|(2:16|(4:18|(3:24|25|(4:27|(1:29)(1:33)|30|31)(1:34))|21|22))|39|(0)|24|25|(0)(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[Catch: Throwable -> 0x006e, TryCatch #0 {Throwable -> 0x006e, blocks: (B:25:0x0047, B:27:0x004b, B:29:0x0054, B:30:0x0063, B:33:0x0057), top: B:24:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap[] doInBackground(String... strArr) {
        Bitmap bitmap;
        boolean z;
        boolean z2;
        String str = strArr[0];
        Context context = this.f5553c.get();
        Bitmap bitmap2 = null;
        if (context == null) {
            return new Bitmap[]{null, null};
        }
        try {
            bitmap = com.facebook.ads.internal.d.c.a(context).a(str, this.i, this.j);
            try {
                z = (this.f == null || this.f.get() == null) ? false : true;
            } catch (Throwable th) {
                th = th;
                Bitmap bitmap3 = null;
                Log.e(f5551b, "Error downloading image: " + str, th);
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(th, null));
                bitmap2 = bitmap3;
                return new Bitmap[]{bitmap, bitmap2};
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
        if (this.g != null) {
            if (this.g.get() != null) {
                z2 = true;
                if ((!z || z2) && bitmap != null) {
                    if (this.f5552a) {
                        com.facebook.ads.internal.q.b.e eVar = new com.facebook.ads.internal.q.b.e(bitmap);
                        eVar.a(this.f5554d != 0 ? this.f5554d : Math.round(bitmap.getWidth() / 40.0f));
                        bitmap2 = eVar.a();
                    } else {
                        bitmap2 = bitmap;
                    }
                }
                return new Bitmap[]{bitmap, bitmap2};
            }
        }
        z2 = false;
        if (!z) {
        }
        if (this.f5552a) {
        }
        return new Bitmap[]{bitmap, bitmap2};
    }
}
