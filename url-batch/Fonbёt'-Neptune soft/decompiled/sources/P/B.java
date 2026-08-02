package P;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C0224b;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class B implements io.flutter.plugin.platform.h {

    /* renamed from: a, reason: collision with root package name */
    public int f827a;

    /* renamed from: b, reason: collision with root package name */
    public int f828b;

    /* renamed from: c, reason: collision with root package name */
    public Object f829c;

    /* renamed from: d, reason: collision with root package name */
    public Object f830d;

    /* renamed from: e, reason: collision with root package name */
    public Object f831e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f832f;

    public B(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f827a = 0;
        this.f828b = 0;
        this.f831e = new Handler();
        this.f832f = new C0224b(this);
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f829c = textureRegistry$ImageTextureEntry;
    }

    @Override // io.flutter.plugin.platform.h
    public long a() {
        return ((TextureRegistry$ImageTextureEntry) this.f829c).id();
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i2, int i3) {
        ImageReader newInstance;
        ImageReader imageReader = (ImageReader) this.f830d;
        if (imageReader != null && this.f827a == i2 && this.f828b == i3) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f829c).pushImage(null);
            ((ImageReader) this.f830d).close();
            this.f830d = null;
        }
        this.f827a = i2;
        this.f828b = i3;
        int i4 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f831e;
        C0224b c0224b = (C0224b) this.f832f;
        if (i4 >= 33) {
            B.e.j();
            ImageReader.Builder e2 = B.e.e(this.f827a, this.f828b);
            e2.setMaxImages(4);
            e2.setImageFormat(34);
            e2.setUsage(256L);
            newInstance = e2.build();
            newInstance.setOnImageAvailableListener(c0224b, handler);
        } else {
            if (i4 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = ImageReader.newInstance(i2, i3, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c0224b, handler);
        }
        this.f830d = newInstance;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f830d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
            int[] iArr = RecyclerView.f1821l0;
            throw null;
        }
        arrayList.clear();
        if (RecyclerView.f1823n0) {
            C0099i c0099i = ((RecyclerView) this.f832f).f1848a0;
            c0099i.getClass();
            c0099i.f920c = 0;
        }
    }

    public void d(int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f832f;
        if (i2 < 0 || i2 >= recyclerView.f1849b0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f1849b0.a() + recyclerView.h());
        }
        E e2 = recyclerView.f1849b0;
        boolean z2 = e2.f836c;
        ArrayList arrayList = (ArrayList) this.f829c;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f1857h.f156h;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f830d;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int y2 = recyclerView.f1855g.y(i2, 0);
        if (y2 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + y2 + ").state:" + e2.a() + recyclerView.h());
    }

    public void e() {
        v vVar = ((RecyclerView) this.f832f).f1866m;
        this.f828b = this.f827a;
        ArrayList arrayList = (ArrayList) this.f830d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f828b) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f1821l0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return this.f828b;
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((ImageReader) this.f830d).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return this.f827a;
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        if (((ImageReader) this.f830d) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f829c).pushImage(null);
            ((ImageReader) this.f830d).close();
            this.f830d = null;
        }
        this.f829c = null;
    }

    @Override // io.flutter.plugin.platform.h
    public /* synthetic */ void scheduleFrame() {
    }

    public B(RecyclerView recyclerView) {
        this.f832f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f829c = arrayList;
        this.f830d = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f827a = 2;
        this.f828b = 2;
    }
}
