package n;

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
import h.AbstractC0454a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z1.AbstractC1053a;

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0695A {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6603d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6604a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f6605b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6606c;

    public /* synthetic */ C0695A() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((P0.l) ((B.f) this.f6606c).f152e).getClass();
        if (keyListener instanceof W.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new W.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i2) {
        switch (this.f6604a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f6605b;
                D0.j R4 = D0.j.R(absSeekBar.getContext(), attributeSet, f6603d, i2);
                Drawable K7 = R4.K(0);
                if (K7 != null) {
                    if (K7 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) K7;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i5 = 0; i5 < numberOfFrames; i5++) {
                            Drawable e7 = e(animationDrawable.getFrame(i5), true);
                            e7.setLevel(10000);
                            animationDrawable2.addFrame(e7, animationDrawable.getDuration(i5));
                        }
                        animationDrawable2.setLevel(10000);
                        K7 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(K7);
                }
                Drawable K8 = R4.K(1);
                if (K8 != null) {
                    absSeekBar.setProgressDrawable(e(K8, false));
                }
                R4.W();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f6605b).getContext().obtainStyledAttributes(attributeSet, AbstractC0454a.f5045i, i2, 0);
                try {
                    boolean z7 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z7);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public W.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        B.f fVar = (B.f) this.f6606c;
        if (inputConnection == null) {
            fVar.getClass();
            inputConnection = null;
        } else {
            P0.l lVar = (P0.l) fVar.f152e;
            lVar.getClass();
            if (!(inputConnection instanceof W.b)) {
                inputConnection = new W.b((EditText) lVar.f2209e, inputConnection, editorInfo);
            }
        }
        return (W.b) inputConnection;
    }

    public void d(boolean z7) {
        W.i iVar = (W.i) ((P0.l) ((B.f) this.f6606c).f152e).f2210i;
        if (iVar.f2784i != z7) {
            if (iVar.f2783e != null) {
                U.j a7 = U.j.a();
                W.h hVar = iVar.f2783e;
                a7.getClass();
                AbstractC1053a.j(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a7.f2667a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a7.f2668b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f2784i = z7;
            if (z7) {
                W.i.a(iVar.f2782d, U.j.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z7) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f6606c) == null) {
                this.f6606c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z7 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            int id = layerDrawable.getId(i2);
            drawableArr[i2] = e(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i5 = 0; i5 < numberOfLayers; i5++) {
            layerDrawable2.setId(i5, layerDrawable.getId(i5));
            layerDrawable2.setLayerGravity(i5, layerDrawable.getLayerGravity(i5));
            layerDrawable2.setLayerWidth(i5, layerDrawable.getLayerWidth(i5));
            layerDrawable2.setLayerHeight(i5, layerDrawable.getLayerHeight(i5));
            layerDrawable2.setLayerInsetLeft(i5, layerDrawable.getLayerInsetLeft(i5));
            layerDrawable2.setLayerInsetRight(i5, layerDrawable.getLayerInsetRight(i5));
            layerDrawable2.setLayerInsetTop(i5, layerDrawable.getLayerInsetTop(i5));
            layerDrawable2.setLayerInsetBottom(i5, layerDrawable.getLayerInsetBottom(i5));
            layerDrawable2.setLayerInsetStart(i5, layerDrawable.getLayerInsetStart(i5));
            layerDrawable2.setLayerInsetEnd(i5, layerDrawable.getLayerInsetEnd(i5));
        }
        return layerDrawable2;
    }

    public C0695A(AbsSeekBar absSeekBar) {
        this.f6605b = absSeekBar;
    }

    public C0695A(EditText editText) {
        this.f6605b = editText;
        this.f6606c = new B.f(editText);
    }
}
