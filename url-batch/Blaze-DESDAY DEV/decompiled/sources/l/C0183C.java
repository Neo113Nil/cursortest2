package l;

import K.C0014l;
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
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0183C {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2796a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f2797b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2798c;

    public /* synthetic */ C0183C() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((B.j) ((C.g) this.f2798c).f80b).getClass();
        if (keyListener instanceof W.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new W.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f2796a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2797b;
                C0014l i2 = C0014l.i(absSeekBar.getContext(), attributeSet, d, i);
                Drawable d2 = i2.d(0);
                if (d2 != null) {
                    if (d2 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) d2;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable e2 = e(animationDrawable.getFrame(i3), true);
                            e2.setLevel(10000);
                            animationDrawable2.addFrame(e2, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        d2 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(d2);
                }
                Drawable d3 = i2.d(1);
                if (d3 != null) {
                    absSeekBar.setProgressDrawable(e(d3, false));
                }
                i2.k();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f2797b).getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public W.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        C.g gVar = (C.g) this.f2798c;
        if (inputConnection == null) {
            gVar.getClass();
            inputConnection = null;
        } else {
            B.j jVar = (B.j) gVar.f80b;
            jVar.getClass();
            if (!(inputConnection instanceof W.b)) {
                inputConnection = new W.b((EditText) jVar.f45b, inputConnection, editorInfo);
            }
        }
        return (W.b) inputConnection;
    }

    public void d(boolean z2) {
        W.i iVar = (W.i) ((B.j) ((C.g) this.f2798c).f80b).f46c;
        if (iVar.f938c != z2) {
            if (iVar.f937b != null) {
                U.j a2 = U.j.a();
                W.h hVar = iVar.f937b;
                a2.getClass();
                z1.d.q(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f857a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f858b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f938c = z2;
            if (z2) {
                W.i.a(iVar.f936a, U.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z2) {
        if (drawable instanceof D.d) {
            ((D.e) ((D.d) drawable)).getClass();
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
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f2798c) == null) {
                    this.f2798c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0183C(AbsSeekBar absSeekBar) {
        this.f2797b = absSeekBar;
    }

    public C0183C(EditText editText) {
        this.f2797b = editText;
        this.f2798c = new C.g(editText);
    }
}
