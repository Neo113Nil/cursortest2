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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class z {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2608a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f2609b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2610c;

    public /* synthetic */ z() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((androidx.emoji2.text.q) ((q3.a) this.f2610c).f3172a).getClass();
        if (keyListener instanceof x0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new x0.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f2608a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2609b;
                androidx.emoji2.text.t i4 = androidx.emoji2.text.t.i(i, 0, absSeekBar.getContext(), attributeSet, d);
                Drawable e4 = i4.e(0);
                if (e4 != null) {
                    if (e4 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) e4;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i5 = 0; i5 < numberOfFrames; i5++) {
                            Drawable e5 = e(animationDrawable.getFrame(i5), true);
                            e5.setLevel(10000);
                            animationDrawable2.addFrame(e5, animationDrawable.getDuration(i5));
                        }
                        animationDrawable2.setLevel(10000);
                        e4 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(e4);
                }
                Drawable e6 = i4.e(1);
                if (e6 != null) {
                    absSeekBar.setProgressDrawable(e(e6, false));
                }
                i4.k();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f2609b).getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
                try {
                    boolean z4 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z4);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public x0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        q3.a aVar = (q3.a) this.f2610c;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) aVar.f3172a;
            qVar.getClass();
            if (!(inputConnection instanceof x0.b)) {
                inputConnection = new x0.b((EditText) qVar.f466g, inputConnection, editorInfo);
            }
        }
        return (x0.b) inputConnection;
    }

    public void d(boolean z4) {
        x0.i iVar = (x0.i) ((androidx.emoji2.text.q) ((q3.a) this.f2610c).f3172a).h;
        if (iVar.h != z4) {
            if (iVar.f3854g != null) {
                androidx.emoji2.text.l a5 = androidx.emoji2.text.l.a();
                x0.h hVar = iVar.f3854g;
                a5.getClass();
                b4.l.h(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a5.f455a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a5.f456b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.h = z4;
            if (z4) {
                x0.i.a(iVar.f3853f, androidx.emoji2.text.l.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z4) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f2610c) == null) {
                this.f2610c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
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

    public z(AbsSeekBar absSeekBar) {
        this.f2609b = absSeekBar;
    }

    public z(EditText editText) {
        this.f2609b = editText;
        this.f2610c = new q3.a(editText);
    }
}
