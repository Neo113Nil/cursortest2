package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.anythink.core.common.v.a.f;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Timer f11515a;

    /* renamed from: b, reason: collision with root package name */
    private long f11516b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0064a f11517c;

    /* renamed from: d, reason: collision with root package name */
    private View f11518d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f11519e;

    /* renamed from: f, reason: collision with root package name */
    private f.b f11520f = new f.b(1);

    /* renamed from: g, reason: collision with root package name */
    private String f11521g;

    /* renamed from: com.anythink.basead.ui.thirdparty.a$a, reason: collision with other inner class name */
    public interface InterfaceC0064a {
        void a(int i);
    }

    public a(Context context, View view, long j9, InterfaceC0064a interfaceC0064a) {
        this.f11521g = "";
        this.f11518d = view;
        TextView textView = new TextView(context);
        textView.setHeight(a(context, 24.0f));
        textView.setGravity(17);
        textView.setPadding(a(context, 14.0f), 0, a(context, 11.0f), 0);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(1, 12.0f);
        int parseColor = Color.parseColor("#99000000");
        float a9 = a(context, 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a9);
        textView.setBackground(gradientDrawable);
        this.f11519e = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.thirdparty.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.a(a.this, 2);
            }
        });
        this.f11517c = interfaceC0064a;
        this.f11516b = j9;
        this.f11521g = Locale.getDefault().getLanguage().equals(com.anythink.expressad.video.dynview.a.a.f21254S) ? "跳过" : "Skip";
    }

    public static /* synthetic */ long b(a aVar, long j9) {
        long j10 = aVar.f11516b - j9;
        aVar.f11516b = j10;
        return j10;
    }

    private static boolean d() {
        return Locale.getDefault().getLanguage().equals(com.anythink.expressad.video.dynview.a.a.f21254S);
    }

    private static TextView a(Context context) {
        TextView textView = new TextView(context);
        textView.setHeight(a(context, 24.0f));
        textView.setGravity(17);
        textView.setPadding(a(context, 14.0f), 0, a(context, 11.0f), 0);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(1, 12.0f);
        int parseColor = Color.parseColor("#99000000");
        float a9 = a(context, 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a9);
        textView.setBackground(gradientDrawable);
        return textView;
    }

    private void c() {
        Timer timer = this.f11515a;
        if (timer != null) {
            timer.cancel();
            this.f11515a = null;
        }
    }

    public final void b() {
        if (this.f11515a == null) {
            Timer timer = new Timer();
            this.f11515a = timer;
            timer.schedule(new TimerTask() { // from class: com.anythink.basead.ui.thirdparty.a.2

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f11523a = 1000;

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    a.this.f11518d.post(new Runnable() { // from class: com.anythink.basead.ui.thirdparty.a.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (a.this.f11518d.getParent() != null && (a.this.f11518d.getParent() instanceof View) && a.this.f11520f.a((View) a.this.f11518d.getParent(), a.this.f11518d, 80, 0)) {
                                if (a.this.f11516b <= 0) {
                                    a.a(a.this, 3);
                                } else {
                                    a aVar = a.this;
                                    a.a(aVar, aVar.f11516b);
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                a.b(a.this, anonymousClass2.f11523a);
                            }
                        }
                    });
                }
            }, 1000L, 1000L);
            this.f11518d.post(new Runnable() { // from class: com.anythink.basead.ui.thirdparty.a.3

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f11526a = 1000;

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    a.a(aVar, aVar.f11516b);
                    a.b(a.this, this.f11526a);
                }
            });
        }
    }

    public final TextView a() {
        return this.f11519e;
    }

    private void a(long j9) {
        int i = (int) (j9 / 1000);
        TextView textView = this.f11519e;
        if (textView != null) {
            textView.setText(i + "s | " + this.f11521g);
        }
    }

    private void a(int i) {
        InterfaceC0064a interfaceC0064a = this.f11517c;
        if (interfaceC0064a != null) {
            interfaceC0064a.a(i);
        }
        TextView textView = this.f11519e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Timer timer = this.f11515a;
        if (timer != null) {
            timer.cancel();
            this.f11515a = null;
        }
    }

    private static int a(Context context, float f6) {
        return (int) ((f6 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ void a(a aVar, int i) {
        InterfaceC0064a interfaceC0064a = aVar.f11517c;
        if (interfaceC0064a != null) {
            interfaceC0064a.a(i);
        }
        TextView textView = aVar.f11519e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Timer timer = aVar.f11515a;
        if (timer != null) {
            timer.cancel();
            aVar.f11515a = null;
        }
    }

    public static /* synthetic */ void a(a aVar, long j9) {
        int i = (int) (j9 / 1000);
        TextView textView = aVar.f11519e;
        if (textView != null) {
            textView.setText(i + "s | " + aVar.f11521g);
        }
    }
}
