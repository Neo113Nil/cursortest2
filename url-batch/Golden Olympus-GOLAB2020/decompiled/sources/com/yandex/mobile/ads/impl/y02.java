package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.qi0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y02 extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f34759a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<n02> f34760b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qi0 f34761c;

    private static final class a implements qi0.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ m2.h[] f34762c = {C1873da.a(a.class, "weakContext", "getWeakContext()Landroid/content/Context;", 0), C1873da.a(a.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ao1 f34763a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ao1 f34764b;

        public a(@NotNull Context context, @NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            this.f34763a = bo1.a(context);
            this.f34764b = bo1.a(imageView);
        }

        @Override // com.yandex.mobile.ads.impl.qi0.b
        public final void a(@Nullable Bitmap bitmap) {
            ImageView imageView;
            if (bitmap != null) {
                ao1 ao1Var = this.f34763a;
                m2.h[] hVarArr = f34762c;
                Context context = (Context) ao1Var.getValue(this, hVarArr[0]);
                if (context == null || (imageView = (ImageView) this.f34764b.getValue(this, hVarArr[1])) == null) {
                    return;
                }
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                imageView.setImageDrawable(new BitmapDrawable(resources, bitmap));
            }
        }
    }

    public y02(@NotNull Context context, @NotNull List<n02> items, @NotNull qi0 imageForPresentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(imageForPresentProvider, "imageForPresentProvider");
        this.f34759a = context;
        this.f34760b = items;
        this.f34761c = imageForPresentProvider;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f34760b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        return this.f34760b.get(i4);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    @NotNull
    public final View getView(int i4, @Nullable View view, @Nullable ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f34759a).inflate(R.layout.monetization_ads_internal_native_popup_item, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(view, "inflate(...)");
        }
        n02 n02Var = this.f34760b.get(i4);
        TextView textView = (TextView) view.findViewById(R.id.menu_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.menu_icon);
        textView.setText(n02Var.c().b());
        p02 c4 = n02Var.c();
        Intrinsics.checkNotNull(imageView);
        this.f34761c.a(c4.a(), new a(this.f34759a, imageView));
        return view;
    }
}
