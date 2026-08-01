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
import java.util.concurrent.locks.ReentrantReadWriteLock;
import u0.C0365d;
import u0.C0372k;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0205B {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3249a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f3250b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3251c;

    public /* synthetic */ C0205B() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0365d) ((A0.c) this.f3251c).f6b).getClass();
        if (keyListener instanceof W.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new W.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f3249a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f3250b;
                C0372k j2 = C0372k.j(absSeekBar.getContext(), attributeSet, d, i);
                Drawable e2 = j2.e(0);
                if (e2 != null) {
                    if (e2 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) e2;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable e3 = e(animationDrawable.getFrame(i2), true);
                            e3.setLevel(10000);
                            animationDrawable2.addFrame(e3, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        e2 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(e2);
                }
                Drawable e4 = j2.e(1);
                if (e4 != null) {
                    absSeekBar.setProgressDrawable(e(e4, false));
                }
                j2.l();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f3250b).getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        A0.c cVar = (A0.c) this.f3251c;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            C0365d c0365d = (C0365d) cVar.f6b;
            c0365d.getClass();
            if (!(inputConnection instanceof W.b)) {
                inputConnection = new W.b((EditText) c0365d.f4175b, inputConnection, editorInfo);
            }
        }
        return (W.b) inputConnection;
    }

    public void d(boolean z2) {
        W.i iVar = (W.i) ((C0365d) ((A0.c) this.f3251c).f6b).f4176c;
        if (iVar.f1264c != z2) {
            if (iVar.f1263b != null) {
                U.j a2 = U.j.a();
                W.h hVar = iVar.f1263b;
                a2.getClass();
                H1.d.j(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f1090a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f1091b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f1264c = z2;
            if (z2) {
                W.i.a(iVar.f1262a, U.j.a().b());
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
                if (((Bitmap) this.f3251c) == null) {
                    this.f3251c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0205B(AbsSeekBar absSeekBar) {
        this.f3250b = absSeekBar;
    }

    public C0205B(EditText editText) {
        this.f3250b = editText;
        this.f3251c = new A0.c(editText);
    }
}
