package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ip extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private hs f8395a;

    /* renamed from: b, reason: collision with root package name */
    private a f8396b;

    /* renamed from: c, reason: collision with root package name */
    private aa f8397c;

    /* renamed from: d, reason: collision with root package name */
    private int f8398d;
    private int e;
    private ib f;
    private ArrayList g;
    private ArrayList h;

    public interface a {
        void a();

        void a(ia iaVar);
    }

    public ip(Context context, hs hsVar, a aVar) {
        super(context);
        this.f8397c = aa.UNSPECIFIED;
        this.f8398d = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = null;
        this.f8395a = hsVar;
        this.f8396b = aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8396b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size >= size2) {
            if (this.f8397c != aa.LANDSCAPE) {
                this.f8397c = aa.LANDSCAPE;
                a();
            }
        } else if (this.f8397c != aa.PORTRAIT) {
            this.f8397c = aa.PORTRAIT;
            a();
        }
        if (this.f8398d != size || this.e != size2) {
            this.f8398d = size;
            this.e = size2;
            float f3 = size;
            float f4 = size2;
            float f5 = 0.0f;
            if (this.f != null && this.f.f8356b != null) {
                float f6 = ((this.f.f8356b.y * f3) / this.f.f8356b.x) / f4;
                if (f6 < 1.0f) {
                    f = (this.f.f8356b.y * f3) / this.f.f8356b.x;
                    f2 = (f4 - f) / 2.0f;
                    for (View view : ac.a(this)) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                        ia iaVar = (ia) view.getTag();
                        float a2 = iaVar.f8350a.a(f3, f);
                        float a3 = iaVar.f8351b.a(f3, f);
                        float a4 = iaVar.f8352c.a(f3, f);
                        float a5 = iaVar.f8353d.a(f3, f);
                        int i3 = iaVar.e;
                        int i4 = iaVar.f;
                        if (i3 == 14) {
                            a2 += (f3 - a4) / 2.0f;
                            i3 = 9;
                        }
                        if (i4 == 15) {
                            a3 += (f - a5) / 2.0f;
                            i4 = 10;
                        }
                        layoutParams.addRule(i3, -1);
                        layoutParams.addRule(i4, -1);
                        layoutParams.width = Math.round(a4);
                        layoutParams.height = Math.round(a5);
                        if (i3 == 9) {
                            layoutParams.leftMargin = Math.round(a2 + f5);
                        } else if (i3 == 11) {
                            layoutParams.rightMargin = Math.round(a2 + f5);
                        }
                        if (i4 == 10) {
                            layoutParams.topMargin = Math.round(a3 + f2);
                        } else if (i4 == 12) {
                            layoutParams.bottomMargin = Math.round(a3 + f2);
                        }
                    }
                } else if (f6 > 1.0f) {
                    float f7 = (this.f.f8356b.x * f4) / this.f.f8356b.y;
                    f5 = (f3 - f7) / 2.0f;
                    f3 = f7;
                }
            }
            f = f4;
            f2 = 0.0f;
            while (r6.hasNext()) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.h != null) {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ih ihVar = (ih) ((WeakReference) it.next()).get();
                    if (ihVar != null) {
                        ihVar.setVisibility(4);
                        ihVar.b();
                    }
                }
            }
            if (this.g != null) {
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    ih ihVar2 = (ih) ((WeakReference) it2.next()).get();
                    if (ihVar2 != null) {
                        ihVar2.setVisibility(0);
                        ihVar2.a();
                    }
                }
                return;
            }
            return;
        }
        if (this.g != null) {
            Iterator it3 = this.g.iterator();
            while (it3.hasNext()) {
                ih ihVar3 = (ih) ((WeakReference) it3.next()).get();
                if (ihVar3 != null) {
                    ihVar3.b();
                }
            }
        }
        if (this.h != null) {
            Iterator it4 = this.h.iterator();
            while (it4.hasNext()) {
                ih ihVar4 = (ih) ((WeakReference) it4.next()).get();
                if (ihVar4 != null) {
                    ihVar4.b();
                }
            }
        }
    }

    private void a() {
        ih ihVar;
        ih ihVar2;
        Iterator it = this.f8395a.f8313a.iterator();
        ib ibVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ib ibVar2 = (ib) it.next();
            if (ibVar2.f8355a == this.f8397c) {
                ibVar = ibVar2;
                break;
            } else if (ibVar2.f8355a == aa.UNSPECIFIED) {
                ibVar = ibVar2;
            }
        }
        removeAllViews();
        if (this.g != null) {
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                ih ihVar3 = (ih) ((WeakReference) it2.next()).get();
                if (ihVar3 != null) {
                    ihVar3.c();
                }
            }
            this.g.clear();
        }
        if (this.h != null) {
            Iterator it3 = this.h.iterator();
            while (it3.hasNext()) {
                ih ihVar4 = (ih) ((WeakReference) it3.next()).get();
                if (ihVar4 != null) {
                    ihVar4.c();
                }
            }
            this.h.clear();
        }
        if (ibVar != null) {
            this.f = ibVar;
            Context context = getContext();
            Iterator it4 = ibVar.f8357c.iterator();
            while (it4.hasNext()) {
                final ia iaVar = (ia) it4.next();
                final RelativeLayout relativeLayout = new RelativeLayout(context);
                if (iaVar.l.f8343c != null) {
                    ih ihVar5 = new ih(context);
                    ihVar5.setScaleType(ImageView.ScaleType.FIT_XY);
                    ihVar5.a(iaVar.l.f8344d, iaVar.l.f8343c);
                    if (this.g == null) {
                        this.g = new ArrayList();
                    }
                    this.g.add(new WeakReference(ihVar5));
                    ihVar = ihVar5;
                } else {
                    ihVar = null;
                }
                if (iaVar.m == null || iaVar.m.f8343c == null) {
                    ihVar2 = null;
                } else {
                    ih ihVar6 = new ih(context);
                    ihVar6.setScaleType(ImageView.ScaleType.FIT_XY);
                    ihVar6.a(iaVar.m.f8344d, iaVar.m.f8343c);
                    if (this.h == null) {
                        this.h = new ArrayList();
                    }
                    this.h.add(new WeakReference(ihVar6));
                    ihVar2 = ihVar6;
                }
                ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                Bitmap bitmap = iaVar.l.f8342b;
                Bitmap bitmap2 = iaVar.m != null ? iaVar.m.f8342b : null;
                final BitmapDrawable bitmapDrawable = bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null;
                final BitmapDrawable bitmapDrawable2 = bitmap2 != null ? new BitmapDrawable((Resources) null, bitmap2) : null;
                if (bitmapDrawable != null) {
                    ab.a(relativeLayout, bitmapDrawable);
                }
                if (ihVar != null) {
                    relativeLayout.addView(ihVar, layoutParams2);
                    ihVar.a();
                }
                if (ihVar2 != null) {
                    relativeLayout.addView(ihVar2, layoutParams2);
                    ihVar2.setVisibility(4);
                }
                final ih ihVar7 = ihVar2;
                final ih ihVar8 = ihVar;
                relativeLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.tapjoy.internal.ip.1
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            if (ihVar7 != null || bitmapDrawable2 != null) {
                                if (ihVar8 != null) {
                                    ihVar8.b();
                                    ihVar8.setVisibility(4);
                                }
                                ab.a(view, null);
                            }
                            if (bitmapDrawable2 != null) {
                                ab.a(view, bitmapDrawable2);
                            } else if (ihVar7 != null) {
                                ihVar7.setVisibility(0);
                                ihVar7.a();
                            }
                        } else {
                            boolean z = true;
                            if (motionEvent.getAction() == 1) {
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x >= 0.0f && x < view.getWidth() && y >= 0.0f && y < view.getHeight()) {
                                    z = false;
                                }
                                if (z) {
                                    if (bitmapDrawable != null) {
                                        ab.a(view, bitmapDrawable);
                                    } else if (bitmapDrawable2 != null) {
                                        ab.a(view, null);
                                    }
                                }
                                if (ihVar7 != null) {
                                    ihVar7.b();
                                    ihVar7.setVisibility(4);
                                }
                                if ((ihVar7 != null || bitmapDrawable2 != null) && ihVar8 != null && z) {
                                    ihVar8.setVisibility(0);
                                    ihVar8.a();
                                }
                            }
                        }
                        return false;
                    }
                });
                relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.tapjoy.internal.ip.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (ihVar7 != null) {
                            ihVar7.b();
                            relativeLayout.removeView(ihVar7);
                        }
                        if (ihVar8 != null) {
                            ihVar8.b();
                            relativeLayout.removeView(ihVar8);
                        }
                        ip.this.f8396b.a(iaVar);
                    }
                });
                relativeLayout.setTag(iaVar);
                addView(relativeLayout, layoutParams);
            }
        }
    }
}
