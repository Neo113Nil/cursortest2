package U;

import E1.AbstractC0026b;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C1044b;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class A implements io.flutter.plugin.platform.i {

    /* renamed from: a, reason: collision with root package name */
    public int f1346a;

    /* renamed from: b, reason: collision with root package name */
    public int f1347b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1348c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1349d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1350e;
    public final Object f;

    public A(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f1346a = 0;
        this.f1347b = 0;
        this.f1350e = new Handler();
        this.f = new C1044b(this);
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f1348c = textureRegistry$ImageTextureEntry;
    }

    public void a(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.f;
        D d3 = recyclerView.f2466U;
        if (i3 < 0 || i3 >= d3.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + d3.a() + recyclerView.h());
        }
        boolean z = d3.f1354c;
        ArrayList arrayList = (ArrayList) this.f1348c;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f2475d.f25d;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f1349d;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int A3 = recyclerView.f2473c.A(i3, 0);
        if (A3 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + A3 + ").state:" + d3.a() + recyclerView.h());
    }

    public void b() {
        this.f1347b = this.f1346a;
        ArrayList arrayList = (ArrayList) this.f1349d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f1347b) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f2443h0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.i
    public void c(int i3, int i4) {
        ImageReader newInstance;
        ImageReader imageReader = (ImageReader) this.f1349d;
        if (imageReader != null && this.f1346a == i3 && this.f1347b == i4) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f1348c).pushImage(null);
            ((ImageReader) this.f1349d).close();
            this.f1349d = null;
        }
        this.f1346a = i3;
        this.f1347b = i4;
        int i5 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f1350e;
        C1044b c1044b = (C1044b) this.f;
        if (i5 >= 33) {
            AbstractC0026b.n();
            ImageReader.Builder i6 = AbstractC0026b.i(this.f1346a, this.f1347b);
            i6.setMaxImages(4);
            i6.setImageFormat(34);
            i6.setUsage(256L);
            newInstance = i6.build();
            newInstance.setOnImageAvailableListener(c1044b, handler);
        } else {
            if (i5 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = ImageReader.newInstance(i3, i4, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c1044b, handler);
        }
        this.f1349d = newInstance;
    }

    @Override // io.flutter.plugin.platform.i
    public int getHeight() {
        return this.f1347b;
    }

    @Override // io.flutter.plugin.platform.i
    public long getId() {
        return ((TextureRegistry$ImageTextureEntry) this.f1348c).id();
    }

    @Override // io.flutter.plugin.platform.i
    public Surface getSurface() {
        return ((ImageReader) this.f1349d).getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public int getWidth() {
        return this.f1346a;
    }

    @Override // io.flutter.plugin.platform.i
    public void release() {
        if (((ImageReader) this.f1349d) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f1348c).pushImage(null);
            ((ImageReader) this.f1349d).close();
            this.f1349d = null;
        }
        this.f1348c = null;
    }

    public A(RecyclerView recyclerView) {
        this.f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1348c = arrayList;
        this.f1349d = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f1346a = 2;
        this.f1347b = 2;
    }
}
