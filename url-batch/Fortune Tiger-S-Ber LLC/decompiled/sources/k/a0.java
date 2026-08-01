package k;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2497d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2498a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f2499b;
    public Object c;

    public /* synthetic */ a0() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((a2.s) ((r0.a) this.c).f3139f).getClass();
        if (keyListener instanceof t0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new t0.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i4) {
        switch (this.f2498a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2499b;
                androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(i4, 0, absSeekBar.getContext(), attributeSet, f2497d);
                Drawable j4 = r3.j(0);
                if (j4 != null) {
                    if (j4 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) j4;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i5 = 0; i5 < numberOfFrames; i5++) {
                            Drawable e4 = e(animationDrawable.getFrame(i5), true);
                            e4.setLevel(10000);
                            animationDrawable2.addFrame(e4, animationDrawable.getDuration(i5));
                        }
                        animationDrawable2.setLevel(10000);
                        j4 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(j4);
                }
                Drawable j5 = r3.j(1);
                if (j5 != null) {
                    absSeekBar.setProgressDrawable(e(j5, false));
                }
                r3.t();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f2499b).getContext().obtainStyledAttributes(attributeSet, e.a.f1500i, i4, 0);
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

    public t0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        r0.a aVar = (r0.a) this.c;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            a2.s sVar = (a2.s) aVar.f3139f;
            sVar.getClass();
            if (!(inputConnection instanceof t0.b)) {
                inputConnection = new t0.b((EditText) sVar.g, inputConnection, editorInfo);
            }
        }
        return (t0.b) inputConnection;
    }

    public void d(boolean z3) {
        t0.i iVar = (t0.i) ((a2.s) ((r0.a) this.c).f3139f).h;
        if (iVar.h != z3) {
            if (iVar.g != null) {
                androidx.emoji2.text.l a4 = androidx.emoji2.text.l.a();
                t0.h hVar = iVar.g;
                a4.getClass();
                k3.d.h(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a4.f341a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a4.f342b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.h = z3;
            if (z3) {
                t0.i.a(iVar.f3375f, androidx.emoji2.text.l.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z3) {
        if (drawable instanceof d0.b) {
            ((d0.c) ((d0.b) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id = layerDrawable.getId(i4);
                    drawableArr[i4] = e(layerDrawable.getDrawable(i4), id == 16908301 || id == 16908303);
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
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public a0(AbsSeekBar absSeekBar) {
        this.f2499b = absSeekBar;
    }

    public a0(EditText editText) {
        this.f2499b = editText;
        this.c = new r0.a(editText);
    }
}
