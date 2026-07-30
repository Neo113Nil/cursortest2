package m;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import g.AbstractC4518a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4714A {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f39224d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39225a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f39226b;

    /* renamed from: c, reason: collision with root package name */
    public Object f39227c;

    public /* synthetic */ C4714A() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((S0.e) ((h4.c) this.f39227c).f38233u).getClass();
        if (keyListener instanceof c0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new c0.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f39225a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f39226b;
                Q0 p6 = Q0.p(absSeekBar.getContext(), attributeSet, f39224d, i);
                Drawable h9 = p6.h(0);
                if (h9 != null) {
                    if (h9 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) h9;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i4 = 0; i4 < numberOfFrames; i4++) {
                            Drawable e6 = e(animationDrawable.getFrame(i4), true);
                            e6.setLevel(10000);
                            animationDrawable2.addFrame(e6, animationDrawable.getDuration(i4));
                        }
                        animationDrawable2.setLevel(10000);
                        h9 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(h9);
                }
                Drawable h10 = p6.h(1);
                if (h10 != null) {
                    absSeekBar.setProgressDrawable(e(h10, false));
                }
                p6.q();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f39226b).getContext().obtainStyledAttributes(attributeSet, AbstractC4518a.i, i, 0);
                try {
                    boolean z8 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z8);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public c0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        h4.c cVar = (h4.c) this.f39227c;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            S0.e eVar = (S0.e) cVar.f38233u;
            eVar.getClass();
            if (!(inputConnection instanceof c0.b)) {
                inputConnection = new c0.b((EditText) eVar.f2891u, inputConnection, editorInfo);
            }
        }
        return (c0.b) inputConnection;
    }

    public void d(boolean z8) {
        c0.i iVar = (c0.i) ((S0.e) ((h4.c) this.f39227c).f38233u).f2892v;
        if (iVar.f5652v != z8) {
            if (iVar.f5651u != null) {
                androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
                c0.h hVar = iVar.f5651u;
                a9.getClass();
                S0.f.f(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a9.f4888a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a9.f4889b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f5652v = z8;
            if (z8) {
                c0.i.a(iVar.f5650n, androidx.emoji2.text.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z8) {
        if (drawable instanceof H.g) {
            ((H.h) ((H.g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    layerDrawable2.setId(i4, layerDrawable.getId(i4));
                    layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
                    layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
                    layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
                    layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
                    layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
                    layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
                    layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
                    layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
                    layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f39227c) == null) {
                    this.f39227c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z8 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C4714A(AbsSeekBar absSeekBar) {
        this.f39226b = absSeekBar;
    }

    public C4714A(EditText editText) {
        this.f39226b = editText;
        this.f39227c = new h4.c(editText);
    }
}
