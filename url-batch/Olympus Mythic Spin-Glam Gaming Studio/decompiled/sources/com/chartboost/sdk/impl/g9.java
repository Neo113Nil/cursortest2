package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.chartboost.sdk.R;
import com.chartboost.sdk.impl.za;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes10.dex */
public final class g9 extends v4 {
    public final za e;
    public final x5 f;
    public final oa g;
    public final CoroutineDispatcher h;
    public final z2 i;
    public Job j;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v2 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new v2(it);
        }
    }

    public static final class b extends Lambda implements Function2 {
        public final /* synthetic */ oa b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oa oaVar, Context context) {
            super(2);
            this.b = oaVar;
            this.c = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w5 invoke(x5 cb, p7 et) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            Intrinsics.checkNotNullParameter(et, "et");
            return new w2(this.b, new hh(this.c), cb, et);
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[za.b.values().length];
            try {
                iArr[za.b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[za.b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[za.b.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[za.b.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ ImageView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImageView imageView, Continuation continuation) {
            super(2, continuation);
            this.d = imageView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return g9.this.new d(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                z2 z2Var = g9.this.i;
                String b = g9.this.e.b();
                this.b = 1;
                obj = z2Var.a(b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.d.setImageBitmap(bitmap);
            }
            this.d.setVisibility(0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(Context context, String baseUrl, String html, za infoIcon, p7 eventTracker, x5 callback, oa impressionInterface, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory, z2 cbImageDownloader) {
        super(context, html, callback, impressionInterface, baseUrl, eventTracker, cbWebViewFactory, null, new b(impressionInterface, context), 128, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.checkNotNullParameter(cbImageDownloader, "cbImageDownloader");
        this.e = infoIcon;
        this.f = callback;
        this.g = impressionInterface;
        this.h = dispatcher;
        this.i = cbImageDownloader;
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    @Override // com.chartboost.sdk.impl.v4, com.chartboost.sdk.impl.cl, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.v4, com.chartboost.sdk.impl.cl, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ g9(Context context, String str, String str2, za zaVar, p7 p7Var, x5 x5Var, oa oaVar, CoroutineDispatcher coroutineDispatcher, Function1 function1, z2 z2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, zaVar, p7Var, x5Var, oaVar, (i & 128) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 256) != 0 ? a.b : function1, (i & 512) != 0 ? new z2(null, null, null, 7, null) : z2Var);
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void a(Throwable th) {
            g9.this.j = null;
        }
    }

    @Override // com.chartboost.sdk.impl.cl
    public void a() {
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.j = null;
        super.a();
    }

    public final int a(double d2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            d2 *= displayMetrics.density;
        }
        return MathKt.roundToInt(d2);
    }

    public final void a(RelativeLayout container) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(container, "container");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a(this.e.e().b()), a(this.e.e().a()));
        int i = c.a[this.e.d().ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else if (i == 4) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        }
        layoutParams.setMargins(a(this.e.c().b()), a(this.e.c().a()), a(this.e.c().b()), a(this.e.c().a()));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.cb_info_icon);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.g9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g9.a(g9.this, view);
            }
        });
        imageView.setVisibility(8);
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.h), null, null, new d(imageView, null), 3, null);
        launch$default.invokeOnCompletion(new e());
        this.j = launch$default;
        container.addView(imageView, layoutParams);
        this.f.a(imageView);
    }

    public static final void a(g9 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g.a(new o3(this$0.e.a(), Boolean.FALSE));
    }
}
