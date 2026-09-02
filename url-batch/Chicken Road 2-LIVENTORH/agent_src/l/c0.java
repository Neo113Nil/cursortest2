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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class c0 {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2253a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f2254b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2255c;

    public /* synthetic */ c0() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((androidx.emoji2.text.q) ((u2.a) this.f2255c).f3355a).getClass();
        if (keyListener instanceof w0.f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new w0.f(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f2253a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2254b;
                androidx.emoji2.text.t w3 = androidx.emoji2.text.t.w(absSeekBar.getContext(), attributeSet, d, i);
                Drawable o4 = w3.o(0);
                if (o4 != null) {
                    if (o4 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) o4;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i4 = 0; i4 < numberOfFrames; i4++) {
                            Drawable e4 = e(animationDrawable.getFrame(i4), true);
                            e4.setLevel(10000);
                            animationDrawable2.addFrame(e4, animationDrawable.getDuration(i4));
                        }
                        animationDrawable2.setLevel(10000);
                        o4 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(o4);
                }
                Drawable o5 = w3.o(1);
                if (o5 != null) {
                    absSeekBar.setProgressDrawable(e(o5, false));
                }
                w3.y();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f2254b).getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
                try {
                    boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z3);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public w0.c c(InputConnection inputConnection, EditorInfo editorInfo) {
        u2.a aVar = (u2.a) this.f2255c;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) aVar.f3355a;
            qVar.getClass();
            if (!(inputConnection instanceof w0.c)) {
                inputConnection = new w0.c((EditText) qVar.f346g, inputConnection, editorInfo);
            }
        }
        return (w0.c) inputConnection;
    }

    public void d(boolean z3) {
        w0.j jVar = (w0.j) ((androidx.emoji2.text.q) ((u2.a) this.f2255c).f3355a).f347h;
        if (jVar.f3575h != z3) {
            if (jVar.f3574g != null) {
                androidx.emoji2.text.l a2 = androidx.emoji2.text.l.a();
                w0.i iVar = jVar.f3574g;
                a2.getClass();
                h.a.m(iVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f333a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f334b.remove(iVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            jVar.f3575h = z3;
            if (z3) {
                w0.j.a(jVar.f3573f, androidx.emoji2.text.l.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z3) {
        if (drawable instanceof g0.b) {
            ((g0.c) ((g0.b) drawable)).getClass();
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
                if (((Bitmap) this.f2255c) == null) {
                    this.f2255c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public c0(AbsSeekBar absSeekBar) {
        this.f2254b = absSeekBar;
    }

    public c0(EditText editText) {
        this.f2254b = editText;
        this.f2255c = new u2.a(editText);
    }
}
