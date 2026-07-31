package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.source.MediaSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class e8 {
    public final Function0 a;
    public final Function0 b;
    public final Context c;

    public e8(Context context, b8 downloadManager, Function0 mediaSourceFactory, Function0 loadControlFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(mediaSourceFactory, "mediaSourceFactory");
        Intrinsics.checkNotNullParameter(loadControlFactory, "loadControlFactory");
        this.a = mediaSourceFactory;
        this.b = loadControlFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.c = applicationContext;
    }

    public final ExoPlayer a() {
        ExoPlayer build = new ExoPlayer.Builder(this.c).setMediaSourceFactory((MediaSource.Factory) this.a.mo4828invoke()).setLoadControl((LoadControl) this.b.mo4828invoke()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ b8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b8 b8Var) {
            super(0);
            this.b = b8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaSource.Factory mo4828invoke() {
            return j6.a(this.b.c());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadControl mo4828invoke() {
            return j6.a(0, 0, 3, (Object) null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ e8(Context context, b8 b8Var, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, b8Var, (i & 4) != 0 ? new a(b8Var) : function0, (i & 8) != 0 ? b.b : function02);
        b8Var = (i & 2) != 0 ? f4.b.a().d() : b8Var;
    }
}
