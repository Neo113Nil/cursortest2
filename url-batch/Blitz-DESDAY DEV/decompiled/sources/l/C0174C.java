package l;

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
import f.AbstractC0084a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0174C {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2847a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f2848b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2849c;

    public /* synthetic */ C0174C() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((D.j) ((E.g) this.f2849c).f170b).getClass();
        if (keyListener instanceof X.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new X.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f2847a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2848b;
                A1.j t2 = A1.j.t(absSeekBar.getContext(), attributeSet, d, i);
                Drawable k2 = t2.k(0);
                if (k2 != null) {
                    if (k2 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) k2;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable e2 = e(animationDrawable.getFrame(i2), true);
                            e2.setLevel(10000);
                            animationDrawable2.addFrame(e2, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        k2 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(k2);
                }
                Drawable k3 = t2.k(1);
                if (k3 != null) {
                    absSeekBar.setProgressDrawable(e(k3, false));
                }
                t2.v();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f2848b).getContext().obtainStyledAttributes(attributeSet, AbstractC0084a.i, i, 0);
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

    public X.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        E.g gVar = (E.g) this.f2849c;
        if (inputConnection == null) {
            gVar.getClass();
            inputConnection = null;
        } else {
            D.j jVar = (D.j) gVar.f170b;
            jVar.getClass();
            if (!(inputConnection instanceof X.b)) {
                inputConnection = new X.b((EditText) jVar.f133b, inputConnection, editorInfo);
            }
        }
        return (X.b) inputConnection;
    }

    public void d(boolean z2) {
        X.i iVar = (X.i) ((D.j) ((E.g) this.f2849c).f170b).f134c;
        if (iVar.f976c != z2) {
            if (iVar.f975b != null) {
                V.j a2 = V.j.a();
                X.h hVar = iVar.f975b;
                a2.getClass();
                z1.l.q(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f888a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f889b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f976c = z2;
            if (z2) {
                X.i.a(iVar.f974a, V.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z2) {
        if (drawable instanceof F.d) {
            ((F.e) ((F.d) drawable)).getClass();
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
                if (((Bitmap) this.f2849c) == null) {
                    this.f2849c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0174C(AbsSeekBar absSeekBar) {
        this.f2848b = absSeekBar;
    }

    public C0174C(EditText editText) {
        this.f2848b = editText;
        this.f2849c = new E.g(editText);
    }
}
