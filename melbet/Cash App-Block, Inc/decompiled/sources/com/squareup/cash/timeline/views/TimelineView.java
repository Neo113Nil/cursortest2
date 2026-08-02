package com.squareup.cash.timeline.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewGroupKt$children$1;
import app.cash.paraphrase.FormattedResource;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.MooncakeButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.timeline.viewmodels.TimelineWidgetModel;
import com.squareup.cash.timeline.views.TimelineDrawing;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.widget.ImageSpan;
import com.squareup.util.cash.Countries;
import com.squareup.wire.ByteArrayProtoReader32;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes7.dex */
public final class TimelineView extends LinearLayout {
    public boolean collapsed;
    public int collapsedSize;
    public ColorPalette colorPalette;
    public int inlineTextColor;
    public TextThemeInfo inlineTextStyle;
    public OnItemClickListener onItemClickListener;
    public int overdueTextColor;
    public int primaryTextColor;
    public int secondaryTextColor;
    public final ShowMoreView showMoreView;
    public final ArrayList states;
    public TextThemeInfo textStyle;
    public ThemeInfo themeInfo;
    public final TimelineDrawing timelineDrawing;
    public int timelinePadding;

    public final class ItemView extends ContourLayout {
        public final ImageView arrowView;
        public boolean inlineTextIsInline;
        public final FigmaTextView inlineTextView;
        public final FigmaTextView primaryTextView;
        public final FigmaTextView secondaryTextView;
        public boolean shouldAllowInlineText;
        public final int textGap;
        public final /* synthetic */ TimelineView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemView(TimelineView timelineView, Context context) {
            super(context);
            context.getClass();
            this.this$0 = timelineView;
            final int i = 5;
            this.textGap = Views.dip((View) this, 5);
            final int i2 = 1;
            this.inlineTextIsInline = true;
            this.shouldAllowInlineText = true;
            final int i3 = 2;
            FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
            Strings.applyStyle(figmaTextView, timelineView.textStyle);
            this.primaryTextView = figmaTextView;
            FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
            Strings.applyStyle(figmaTextView2, timelineView.textStyle);
            figmaTextView2.setGravity(8388613);
            this.secondaryTextView = figmaTextView2;
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.mooncake_chevron_right);
            imageView.setImageTintList(ColorStateList.valueOf(timelineView.colorPalette.chevron));
            this.arrowView = imageView;
            FigmaTextView figmaTextView3 = new FigmaTextView(context, null, 2, null);
            Strings.applyStyle(figmaTextView3, timelineView.inlineTextStyle);
            figmaTextView3.setSingleLine(true);
            figmaTextView3.setEllipsize(TextUtils.TruncateAt.END);
            this.inlineTextView = figmaTextView3;
            setFocusable(true);
            setPaddingRelative(getPaddingStart(), Views.dip((View) this, 16), getPaddingEnd(), Views.dip((View) this, 16));
            contourHeightWrapContent();
            final int i4 = 6;
            ContourLayout.layoutBy$default(this, figmaTextView, ContourLayout.leftTo(new TaxWebAppBridge$$ExternalSyntheticLambda1(i)), ContourLayout.topTo(new TaxWebAppBridge$$ExternalSyntheticLambda1(i4)));
            final int i5 = 7;
            ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new TaxWebAppBridge$$ExternalSyntheticLambda1(i5));
            final int i6 = 3;
            rightTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.timeline.views.TimelineView$ItemView$$ExternalSyntheticLambda2
                public final /* synthetic */ TimelineView.ItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i7 = i6;
                    TimelineView.ItemView itemView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    layoutSpec.getClass();
                    switch (i7) {
                        case 0:
                            return new YInt(itemView.inlineTextIsInline ? layoutSpec.getParent().padding().top : Math.max(itemView.m3810bottomdBGyhoQ(itemView.primaryTextView), itemView.m3810bottomdBGyhoQ(itemView.secondaryTextView)));
                        case 1:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3818rightTENr5nQ(itemView.primaryTextView) + itemView.textGap : layoutSpec.getParent().padding().left);
                        case 2:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3816leftTENr5nQ(itemView.secondaryTextView) - itemView.textGap : layoutSpec.getParent().m4374rightblrYgr0());
                        case 3:
                            return new XInt(itemView.m3813getXdipTENr5nQ(18));
                        case 4:
                            return new YInt(itemView.m3812centerYdBGyhoQ(itemView.secondaryTextView));
                        case 5:
                            return new YInt(itemView.m3814getYdipdBGyhoQ(18));
                        case 6:
                            return new XInt(itemView.m3816leftTENr5nQ(itemView.arrowView));
                        default:
                            FigmaTextView figmaTextView4 = itemView.primaryTextView;
                            return new YInt(Math.max(itemView.m3819topdBGyhoQ(figmaTextView4), ((itemView.m3815heightdBGyhoQ(figmaTextView4) / 2) + itemView.m3819topdBGyhoQ(figmaTextView4)) - (itemView.m3815heightdBGyhoQ(itemView.secondaryTextView) / 2)));
                    }
                }
            });
            final int i7 = 4;
            ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.timeline.views.TimelineView$ItemView$$ExternalSyntheticLambda2
                public final /* synthetic */ TimelineView.ItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i7;
                    TimelineView.ItemView itemView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    layoutSpec.getClass();
                    switch (i72) {
                        case 0:
                            return new YInt(itemView.inlineTextIsInline ? layoutSpec.getParent().padding().top : Math.max(itemView.m3810bottomdBGyhoQ(itemView.primaryTextView), itemView.m3810bottomdBGyhoQ(itemView.secondaryTextView)));
                        case 1:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3818rightTENr5nQ(itemView.primaryTextView) + itemView.textGap : layoutSpec.getParent().padding().left);
                        case 2:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3816leftTENr5nQ(itemView.secondaryTextView) - itemView.textGap : layoutSpec.getParent().m4374rightblrYgr0());
                        case 3:
                            return new XInt(itemView.m3813getXdipTENr5nQ(18));
                        case 4:
                            return new YInt(itemView.m3812centerYdBGyhoQ(itemView.secondaryTextView));
                        case 5:
                            return new YInt(itemView.m3814getYdipdBGyhoQ(18));
                        case 6:
                            return new XInt(itemView.m3816leftTENr5nQ(itemView.arrowView));
                        default:
                            FigmaTextView figmaTextView4 = itemView.primaryTextView;
                            return new YInt(Math.max(itemView.m3819topdBGyhoQ(figmaTextView4), ((itemView.m3815heightdBGyhoQ(figmaTextView4) / 2) + itemView.m3819topdBGyhoQ(figmaTextView4)) - (itemView.m3815heightdBGyhoQ(itemView.secondaryTextView) / 2)));
                    }
                }
            });
            centerVerticallyTo.heightOf(1, new Function1(this) { // from class: com.squareup.cash.timeline.views.TimelineView$ItemView$$ExternalSyntheticLambda2
                public final /* synthetic */ TimelineView.ItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i;
                    TimelineView.ItemView itemView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    layoutSpec.getClass();
                    switch (i72) {
                        case 0:
                            return new YInt(itemView.inlineTextIsInline ? layoutSpec.getParent().padding().top : Math.max(itemView.m3810bottomdBGyhoQ(itemView.primaryTextView), itemView.m3810bottomdBGyhoQ(itemView.secondaryTextView)));
                        case 1:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3818rightTENr5nQ(itemView.primaryTextView) + itemView.textGap : layoutSpec.getParent().padding().left);
                        case 2:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3816leftTENr5nQ(itemView.secondaryTextView) - itemView.textGap : layoutSpec.getParent().m4374rightblrYgr0());
                        case 3:
                            return new XInt(itemView.m3813getXdipTENr5nQ(18));
                        case 4:
                            return new YInt(itemView.m3812centerYdBGyhoQ(itemView.secondaryTextView));
                        case 5:
                            return new YInt(itemView.m3814getYdipdBGyhoQ(18));
                        case 6:
                            return new XInt(itemView.m3816leftTENr5nQ(itemView.arrowView));
                        default:
                            FigmaTextView figmaTextView4 = itemView.primaryTextView;
                            return new YInt(Math.max(itemView.m3819topdBGyhoQ(figmaTextView4), ((itemView.m3815heightdBGyhoQ(figmaTextView4) / 2) + itemView.m3819topdBGyhoQ(figmaTextView4)) - (itemView.m3815heightdBGyhoQ(itemView.secondaryTextView) / 2)));
                    }
                }
            });
            ContourLayout.layoutBy$default(this, imageView, rightTo, centerVerticallyTo);
            ContourLayout.layoutBy$default(this, figmaTextView2, ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.timeline.views.TimelineView$ItemView$$ExternalSyntheticLambda2
                public final /* synthetic */ TimelineView.ItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i4;
                    TimelineView.ItemView itemView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    layoutSpec.getClass();
                    switch (i72) {
                        case 0:
                            return new YInt(itemView.inlineTextIsInline ? layoutSpec.getParent().padding().top : Math.max(itemView.m3810bottomdBGyhoQ(itemView.primaryTextView), itemView.m3810bottomdBGyhoQ(itemView.secondaryTextView)));
                        case 1:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3818rightTENr5nQ(itemView.primaryTextView) + itemView.textGap : layoutSpec.getParent().padding().left);
                        case 2:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3816leftTENr5nQ(itemView.secondaryTextView) - itemView.textGap : layoutSpec.getParent().m4374rightblrYgr0());
                        case 3:
                            return new XInt(itemView.m3813getXdipTENr5nQ(18));
                        case 4:
                            return new YInt(itemView.m3812centerYdBGyhoQ(itemView.secondaryTextView));
                        case 5:
                            return new YInt(itemView.m3814getYdipdBGyhoQ(18));
                        case 6:
                            return new XInt(itemView.m3816leftTENr5nQ(itemView.arrowView));
                        default:
                            FigmaTextView figmaTextView4 = itemView.primaryTextView;
                            return new YInt(Math.max(itemView.m3819topdBGyhoQ(figmaTextView4), ((itemView.m3815heightdBGyhoQ(figmaTextView4) / 2) + itemView.m3819topdBGyhoQ(figmaTextView4)) - (itemView.m3815heightdBGyhoQ(itemView.secondaryTextView) / 2)));
                    }
                }
            }), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.timeline.views.TimelineView$ItemView$$ExternalSyntheticLambda2
                public final /* synthetic */ TimelineView.ItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i5;
                    TimelineView.ItemView itemView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    layoutSpec.getClass();
                    switch (i72) {
                        case 0:
                            return new YInt(itemView.inlineTextIsInline ? layoutSpec.getParent().padding().top : Math.max(itemView.m3810bottomdBGyhoQ(itemView.primaryTextView), itemView.m3810bottomdBGyhoQ(itemView.secondaryTextView)));
                        case 1:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3818rightTENr5nQ(itemView.primaryTextView) + itemView.textGap : layoutSpec.getParent().padding().left);
                        case 2:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3816leftTENr5nQ(itemView.secondaryTextView) - itemView.textGap : layoutSpec.getParent().m4374rightblrYgr0());
                        case 3:
                            return new XInt(itemView.m3813getXdipTENr5nQ(18));
                        case 4:
                            return new YInt(itemView.m3812centerYdBGyhoQ(itemView.secondaryTextView));
                        case 5:
                            return new YInt(itemView.m3814getYdipdBGyhoQ(18));
                        case 6:
                            return new XInt(itemView.m3816leftTENr5nQ(itemView.arrowView));
                        default:
                            FigmaTextView figmaTextView4 = itemView.primaryTextView;
                            return new YInt(Math.max(itemView.m3819topdBGyhoQ(figmaTextView4), ((itemView.m3815heightdBGyhoQ(figmaTextView4) / 2) + itemView.m3819topdBGyhoQ(figmaTextView4)) - (itemView.m3815heightdBGyhoQ(itemView.secondaryTextView) / 2)));
                    }
                }
            }));
            ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.timeline.views.TimelineView$ItemView$$ExternalSyntheticLambda2
                public final /* synthetic */ TimelineView.ItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i2;
                    TimelineView.ItemView itemView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    layoutSpec.getClass();
                    switch (i72) {
                        case 0:
                            return new YInt(itemView.inlineTextIsInline ? layoutSpec.getParent().padding().top : Math.max(itemView.m3810bottomdBGyhoQ(itemView.primaryTextView), itemView.m3810bottomdBGyhoQ(itemView.secondaryTextView)));
                        case 1:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3818rightTENr5nQ(itemView.primaryTextView) + itemView.textGap : layoutSpec.getParent().padding().left);
                        case 2:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3816leftTENr5nQ(itemView.secondaryTextView) - itemView.textGap : layoutSpec.getParent().m4374rightblrYgr0());
                        case 3:
                            return new XInt(itemView.m3813getXdipTENr5nQ(18));
                        case 4:
                            return new YInt(itemView.m3812centerYdBGyhoQ(itemView.secondaryTextView));
                        case 5:
                            return new YInt(itemView.m3814getYdipdBGyhoQ(18));
                        case 6:
                            return new XInt(itemView.m3816leftTENr5nQ(itemView.arrowView));
                        default:
                            FigmaTextView figmaTextView4 = itemView.primaryTextView;
                            return new YInt(Math.max(itemView.m3819topdBGyhoQ(figmaTextView4), ((itemView.m3815heightdBGyhoQ(figmaTextView4) / 2) + itemView.m3819topdBGyhoQ(figmaTextView4)) - (itemView.m3815heightdBGyhoQ(itemView.secondaryTextView) / 2)));
                    }
                }
            });
            leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.timeline.views.TimelineView$ItemView$$ExternalSyntheticLambda2
                public final /* synthetic */ TimelineView.ItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i3;
                    TimelineView.ItemView itemView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    layoutSpec.getClass();
                    switch (i72) {
                        case 0:
                            return new YInt(itemView.inlineTextIsInline ? layoutSpec.getParent().padding().top : Math.max(itemView.m3810bottomdBGyhoQ(itemView.primaryTextView), itemView.m3810bottomdBGyhoQ(itemView.secondaryTextView)));
                        case 1:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3818rightTENr5nQ(itemView.primaryTextView) + itemView.textGap : layoutSpec.getParent().padding().left);
                        case 2:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3816leftTENr5nQ(itemView.secondaryTextView) - itemView.textGap : layoutSpec.getParent().m4374rightblrYgr0());
                        case 3:
                            return new XInt(itemView.m3813getXdipTENr5nQ(18));
                        case 4:
                            return new YInt(itemView.m3812centerYdBGyhoQ(itemView.secondaryTextView));
                        case 5:
                            return new YInt(itemView.m3814getYdipdBGyhoQ(18));
                        case 6:
                            return new XInt(itemView.m3816leftTENr5nQ(itemView.arrowView));
                        default:
                            FigmaTextView figmaTextView4 = itemView.primaryTextView;
                            return new YInt(Math.max(itemView.m3819topdBGyhoQ(figmaTextView4), ((itemView.m3815heightdBGyhoQ(figmaTextView4) / 2) + itemView.m3819topdBGyhoQ(figmaTextView4)) - (itemView.m3815heightdBGyhoQ(itemView.secondaryTextView) / 2)));
                    }
                }
            });
            final int i8 = 0;
            ContourLayout.layoutBy$default(this, figmaTextView3, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.timeline.views.TimelineView$ItemView$$ExternalSyntheticLambda2
                public final /* synthetic */ TimelineView.ItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i8;
                    TimelineView.ItemView itemView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    layoutSpec.getClass();
                    switch (i72) {
                        case 0:
                            return new YInt(itemView.inlineTextIsInline ? layoutSpec.getParent().padding().top : Math.max(itemView.m3810bottomdBGyhoQ(itemView.primaryTextView), itemView.m3810bottomdBGyhoQ(itemView.secondaryTextView)));
                        case 1:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3818rightTENr5nQ(itemView.primaryTextView) + itemView.textGap : layoutSpec.getParent().padding().left);
                        case 2:
                            return new XInt(itemView.inlineTextIsInline ? itemView.m3816leftTENr5nQ(itemView.secondaryTextView) - itemView.textGap : layoutSpec.getParent().m4374rightblrYgr0());
                        case 3:
                            return new XInt(itemView.m3813getXdipTENr5nQ(18));
                        case 4:
                            return new YInt(itemView.m3812centerYdBGyhoQ(itemView.secondaryTextView));
                        case 5:
                            return new YInt(itemView.m3814getYdipdBGyhoQ(18));
                        case 6:
                            return new XInt(itemView.m3816leftTENr5nQ(itemView.arrowView));
                        default:
                            FigmaTextView figmaTextView4 = itemView.primaryTextView;
                            return new YInt(Math.max(itemView.m3819topdBGyhoQ(figmaTextView4), ((itemView.m3815heightdBGyhoQ(figmaTextView4) / 2) + itemView.m3819topdBGyhoQ(figmaTextView4)) - (itemView.m3815heightdBGyhoQ(itemView.secondaryTextView) / 2)));
                    }
                }
            }));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
        @Override // com.squareup.contour.ContourLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onMeasure(int i, int i2) {
            int i3;
            int i4;
            boolean z;
            boolean z2;
            FigmaTextView figmaTextView;
            super.onMeasure(i, i2);
            FigmaTextView figmaTextView2 = this.primaryTextView;
            boolean z3 = false;
            figmaTextView2.measure(0, 0);
            FigmaTextView figmaTextView3 = this.secondaryTextView;
            figmaTextView3.measure(0, 0);
            int measuredWidth = figmaTextView2.getMeasuredWidth();
            int i5 = this.textGap;
            int i6 = measuredWidth + i5;
            if (figmaTextView3.getVisibility() == 0) {
                CharSequence text = figmaTextView3.getText();
                text.getClass();
                if (text.length() > 0) {
                    i3 = figmaTextView3.getMeasuredWidth() + i5;
                    int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                    int i7 = measuredWidth2 - i6;
                    i4 = i7 - i3;
                    z = true;
                    if (i4 >= 0) {
                        double d = i6 / measuredWidth2;
                        if (d >= 0.5d && i3 / r9 >= 0.5d) {
                            int i8 = measuredWidth2 / 2;
                            figmaTextView2.setMaxWidth(i8);
                            figmaTextView3.setMaxWidth(i8);
                        } else if (d >= 0.5d) {
                            figmaTextView2.setMaxWidth(measuredWidth2 - i3);
                        } else {
                            figmaTextView3.setMaxWidth(i7);
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    figmaTextView = this.inlineTextView;
                    if (figmaTextView.getVisibility() != 0) {
                        figmaTextView.measure(0, 0);
                        if (figmaTextView.getMeasuredWidth() <= i4 && this.shouldAllowInlineText) {
                            z3 = true;
                        }
                        this.inlineTextIsInline = z3;
                    } else {
                        z = z2;
                    }
                    if (z) {
                        return;
                    }
                    requestLayout();
                    super.onMeasure(i, i2);
                    return;
                }
            }
            i3 = 0;
            int measuredWidth22 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int i72 = measuredWidth22 - i6;
            i4 = i72 - i3;
            z = true;
            if (i4 >= 0) {
            }
            figmaTextView = this.inlineTextView;
            if (figmaTextView.getVisibility() != 0) {
            }
            if (z) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void setItem(TimelineWidgetModel.Item item) {
            int i;
            String str;
            int paintFlags;
            item.getClass();
            FigmaTextView figmaTextView = this.primaryTextView;
            figmaTextView.setMaxWidth(Integer.MAX_VALUE);
            FigmaTextView figmaTextView2 = this.secondaryTextView;
            figmaTextView2.setMaxWidth(Integer.MAX_VALUE);
            TimelineWidgetModel.Item.InlineText inlineText = item.inlineText;
            Object obj = item.clickEvent;
            TimelineWidgetModel.Item.State state = item.state;
            int i2 = 1;
            this.shouldAllowInlineText = inlineText != null ? inlineText.shouldAllowInlineText : true;
            figmaTextView.setText(item.primaryText);
            int ordinal = state.ordinal();
            TimelineView timelineView = this.this$0;
            if (ordinal != 0 && ordinal != 2 && ordinal != 6) {
                switch (ordinal) {
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                    default:
                        i = timelineView.secondaryTextColor;
                        break;
                }
                str = item.secondaryText;
                if (str == null) {
                    figmaTextView2.setText(str);
                    figmaTextView2.setVisibility(0);
                    figmaTextView2.setTextColor(i);
                    switch (state.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            paintFlags = figmaTextView2.getPaintFlags() & (-17);
                            break;
                        case 4:
                        case 5:
                        case 13:
                            paintFlags = figmaTextView2.getPaintFlags() | 16;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                    }
                    figmaTextView2.setPaintFlags(paintFlags);
                } else {
                    figmaTextView2.setVisibility(8);
                }
                figmaTextView.setTextColor(i);
                this.arrowView.setVisibility((obj == null && item.emphasizeWhenClickable) ? 0 : 8);
                FigmaTextView figmaTextView3 = this.inlineTextView;
                if (inlineText != null) {
                    figmaTextView3.setVisibility(8);
                } else {
                    figmaTextView3.setText(inlineText.text);
                    figmaTextView3.setVisibility(0);
                    int ordinal2 = inlineText.state.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            i = timelineView.inlineTextColor;
                        } else {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            i = timelineView.overdueTextColor;
                        }
                    }
                    figmaTextView3.setTextColor(i);
                }
                if (obj == null) {
                    setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i2, timelineView, item));
                    return;
                } else {
                    setOnClickListener(null);
                    setClickable(false);
                    return;
                }
            }
            i = timelineView.primaryTextColor;
            str = item.secondaryText;
            if (str == null) {
            }
            figmaTextView.setTextColor(i);
            this.arrowView.setVisibility((obj == null && item.emphasizeWhenClickable) ? 0 : 8);
            FigmaTextView figmaTextView32 = this.inlineTextView;
            if (inlineText != null) {
            }
            if (obj == null) {
            }
        }
    }

    public interface OnItemClickListener {
    }

    /* loaded from: classes6.dex */
    public final class ShowMoreView extends MooncakeButton {
        public int numHidden;

        public final void setNumHidden(int i) {
            this.numHidden = i;
            updateText();
        }

        public final void updateText() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Context context = getContext();
            context.getClass();
            ImageSpan imageSpan = new ImageSpan(context, R.drawable.timeline_show_more, Integer.valueOf(this.colorPalette.placeholderIcon), 0, Views.dip((View) this, 12), 0, null, 472);
            int length = spannableStringBuilder.length();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(' ');
            spannableStringBuilder.setSpan(imageSpan, length, (spannableStringBuilder.length() - length2) + length, 17);
            Context context2 = getContext();
            context2.getClass();
            spannableStringBuilder.append((CharSequence) Countries.getString(context2, new FormattedResource(R.string.timeline_expand_show_more, new Object[]{Integer.valueOf(this.numHidden)})));
            setText(new SpannedString(spannableStringBuilder));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineView(Context context) {
        super(context);
        context.getClass();
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        ColorPalette colorPalette = themeInfo.colorPalette;
        this.colorPalette = colorPalette;
        this.primaryTextColor = colorPalette.label;
        this.overdueTextColor = colorPalette.error;
        this.textStyle = TextStyles.mainTitle;
        int i = colorPalette.tertiaryLabel;
        this.secondaryTextColor = i;
        this.inlineTextColor = i;
        this.inlineTextStyle = TextStyles.mainBody;
        this.collapsedSize = 1;
        this.timelineDrawing = new TimelineDrawing(context, colorPalette);
        ShowMoreView showMoreView = new ShowMoreView(context, null);
        showMoreView.setGravity(16);
        showMoreView.setSingleLine();
        showMoreView.setTextColor(showMoreView.colorPalette.tint);
        showMoreView.setPaddingRelative(0, showMoreView.getPaddingTop(), showMoreView.getPaddingEnd(), showMoreView.getPaddingBottom());
        showMoreView.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 11));
        showMoreView.updateText();
        showMoreView.setVisibility(8);
        this.showMoreView = showMoreView;
        this.states = new ArrayList();
        setOrientation(1);
        setWillNotDraw(false);
        addView(showMoreView);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        this.timelineDrawing.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateTimelineDrawing();
    }

    public final void setCollapsed(boolean z) {
        this.collapsed = z;
        updateCollapsedState();
    }

    public final void setColorPalette(ColorPalette colorPalette) {
        colorPalette.getClass();
        this.colorPalette = colorPalette;
        updateTimelineDrawing();
        invalidate();
    }

    public final void setInlineTextColor(int i) {
        this.inlineTextColor = i;
    }

    public final void setInlineTextStyle(TextThemeInfo textThemeInfo) {
        textThemeInfo.getClass();
        this.inlineTextStyle = textThemeInfo;
    }

    public final void setModel(TimelineWidgetModel timelineWidgetModel) {
        timelineWidgetModel.getClass();
        this.collapsedSize = timelineWidgetModel.collapsedSize;
        ArrayList arrayList = this.states;
        arrayList.clear();
        ArrayList arrayList2 = timelineWidgetModel.items;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((TimelineWidgetModel.Item) it.next()).state);
        }
        arrayList.addAll(arrayList3);
        Views.resizeAndBind$default(this, arrayList2.size(), null, new PageTagSlotKt$$ExternalSyntheticLambda0(this, 4), new FieldBinding$$ExternalSyntheticLambda4(timelineWidgetModel, 2), 10);
        this.showMoreView.setNumHidden(arrayList2.size() - this.collapsedSize);
        updateCollapsedState();
    }

    public final void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public final void setOverdueTextColor(int i) {
        this.overdueTextColor = i;
    }

    public final void setPrimaryTextColor(int i) {
        this.primaryTextColor = i;
    }

    public final void setSecondaryTextColor(int i) {
        this.secondaryTextColor = i;
    }

    public final void setTextStyle(TextThemeInfo textThemeInfo) {
        textThemeInfo.getClass();
        this.textStyle = textThemeInfo;
    }

    public final void setThemeInfo(ThemeInfo themeInfo) {
        themeInfo.getClass();
        this.themeInfo = themeInfo;
    }

    public final void setTimelinePadding(int i) {
        this.timelinePadding = i;
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setPaddingRelative(i, view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    public final void updateCollapsedState() {
        int i = 8;
        int i2 = this.collapsed ? 8 : 0;
        int childCount = getChildCount() - 1;
        int i3 = this.collapsedSize;
        for (int i4 = 0; i4 < i3; i4++) {
            getChildAt(i4).setVisibility(0);
        }
        for (int i5 = this.collapsedSize; i5 < childCount; i5++) {
            getChildAt(i5).setVisibility(i2);
        }
        if (this.collapsed && childCount > this.collapsedSize) {
            i = 0;
        }
        this.showMoreView.setVisibility(i);
    }

    public final void updateTimelineDrawing() {
        int i;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer num;
        Drawable drawable;
        Integer valueOf4;
        Drawable drawable2;
        Integer valueOf5;
        ArrayList arrayList = this.states;
        boolean isEmpty = arrayList.isEmpty();
        TimelineDrawing timelineDrawing = this.timelineDrawing;
        if (isEmpty) {
            EmptyList emptyList = EmptyList.INSTANCE;
            timelineDrawing.getClass();
            emptyList.getClass();
            timelineDrawing.elements = emptyList;
            return;
        }
        int childCount = this.collapsed ? this.collapsedSize : getChildCount() - 1;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.collapsed && this.collapsedSize > 0 && arrayList.size() > this.collapsedSize;
        Iterator it = SequencesKt___SequencesKt.take(new ViewGroupKt$children$1(this), childCount).iterator();
        int i2 = 0;
        while (true) {
            Integer valueOf6 = null;
            if (!it.hasNext()) {
                timelineDrawing.centerX = getPaddingLeft() + this.timelinePadding + timelineDrawing.circleRadius;
                timelineDrawing.elements = arrayList2;
                timelineDrawing.tailEnd = z ? Float.valueOf(this.showMoreView.getTop() - timelineDrawing.halfLineWidth) : null;
                return;
            }
            View view = (View) it.next();
            if (view instanceof ItemView) {
                int i3 = i2 + 1;
                if (i3 < arrayList.size()) {
                    boolean isEmpty2 = SetsKt___SetsKt.minus(SetsKt__SetsKt.setOfNotNull((TimelineWidgetModel.Item.State) arrayList.get(i3), (TimelineWidgetModel.Item.State) arrayList.get(i2)), (Iterable) ArraysKt___ArraysKt.toSet(new TimelineWidgetModel.Item.State[]{TimelineWidgetModel.Item.State.HIGHLIGHT_COMPLETED, TimelineWidgetModel.Item.State.HIGHLIGHT})).isEmpty();
                    ColorPalette colorPalette = this.colorPalette;
                    i = isEmpty2 ? colorPalette.tint : colorPalette.outline;
                } else {
                    i = 0;
                }
                switch (((TimelineWidgetModel.Item.State) arrayList.get(i2)).ordinal()) {
                    case 0:
                        valueOf = Integer.valueOf(ColorUtils.setAlphaComponent(this.colorPalette.tint, 31));
                        valueOf2 = Integer.valueOf(this.colorPalette.tint);
                        num = valueOf;
                        drawable = null;
                        valueOf3 = valueOf2;
                        ItemView itemView = (ItemView) view;
                        float top = itemView.getTop();
                        FigmaTextView figmaTextView = itemView.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView.getMeasuredHeight() / 2.0f) + figmaTextView.getTop() + top, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 1:
                    case 6:
                    case 13:
                        valueOf3 = Integer.valueOf(this.colorPalette.outline);
                        num = null;
                        drawable = null;
                        ItemView itemView2 = (ItemView) view;
                        float top2 = itemView2.getTop();
                        FigmaTextView figmaTextView2 = itemView2.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView2.getMeasuredHeight() / 2.0f) + figmaTextView2.getTop() + top2, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 2:
                        valueOf4 = Integer.valueOf(this.colorPalette.label);
                        drawable2 = timelineDrawing.pendingDrawable;
                        valueOf3 = valueOf4;
                        num = valueOf6;
                        drawable = drawable2;
                        ItemView itemView22 = (ItemView) view;
                        float top22 = itemView22.getTop();
                        FigmaTextView figmaTextView22 = itemView22.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView22.getMeasuredHeight() / 2.0f) + figmaTextView22.getTop() + top22, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 3:
                        valueOf5 = Integer.valueOf(this.colorPalette.outline);
                        drawable2 = timelineDrawing.completeDrawable;
                        num = valueOf5;
                        valueOf3 = null;
                        drawable = drawable2;
                        ItemView itemView222 = (ItemView) view;
                        float top222 = itemView222.getTop();
                        FigmaTextView figmaTextView222 = itemView222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView222.getMeasuredHeight() / 2.0f) + figmaTextView222.getTop() + top222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 4:
                        valueOf5 = Integer.valueOf(this.colorPalette.outline);
                        drawable2 = timelineDrawing.skippedDrawable;
                        num = valueOf5;
                        valueOf3 = null;
                        drawable = drawable2;
                        ItemView itemView2222 = (ItemView) view;
                        float top2222 = itemView2222.getTop();
                        FigmaTextView figmaTextView2222 = itemView2222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView2222.getMeasuredHeight() / 2.0f) + figmaTextView2222.getTop() + top2222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 5:
                        valueOf5 = Integer.valueOf(this.colorPalette.outline);
                        drawable2 = timelineDrawing.missedDrawable;
                        num = valueOf5;
                        valueOf3 = null;
                        drawable = drawable2;
                        ItemView itemView22222 = (ItemView) view;
                        float top22222 = itemView22222.getTop();
                        FigmaTextView figmaTextView22222 = itemView22222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView22222.getMeasuredHeight() / 2.0f) + figmaTextView22222.getTop() + top22222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 7:
                        valueOf5 = Integer.valueOf(this.colorPalette.outline);
                        drawable2 = timelineDrawing.refundDrawable;
                        num = valueOf5;
                        valueOf3 = null;
                        drawable = drawable2;
                        ItemView itemView222222 = (ItemView) view;
                        float top222222 = itemView222222.getTop();
                        FigmaTextView figmaTextView222222 = itemView222222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView222222.getMeasuredHeight() / 2.0f) + figmaTextView222222.getTop() + top222222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 8:
                        Theme theme = this.themeInfo.theme;
                        Theme theme2 = Theme.MooncakeDark;
                        ColorPalette colorPalette2 = this.colorPalette;
                        valueOf5 = theme == theme2 ? Integer.valueOf(colorPalette2.outline) : Integer.valueOf(colorPalette2.icon);
                        drawable2 = timelineDrawing.refundAltDrawable;
                        num = valueOf5;
                        valueOf3 = null;
                        drawable = drawable2;
                        ItemView itemView2222222 = (ItemView) view;
                        float top2222222 = itemView2222222.getTop();
                        FigmaTextView figmaTextView2222222 = itemView2222222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView2222222.getMeasuredHeight() / 2.0f) + figmaTextView2222222.getTop() + top2222222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 9:
                        Theme theme3 = this.themeInfo.theme;
                        Theme theme4 = Theme.MooncakeDark;
                        ColorPalette colorPalette3 = this.colorPalette;
                        valueOf5 = theme3 == theme4 ? Integer.valueOf(colorPalette3.outline) : Integer.valueOf(colorPalette3.icon);
                        drawable2 = timelineDrawing.canceledDrawable;
                        num = valueOf5;
                        valueOf3 = null;
                        drawable = drawable2;
                        ItemView itemView22222222 = (ItemView) view;
                        float top22222222 = itemView22222222.getTop();
                        FigmaTextView figmaTextView22222222 = itemView22222222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView22222222.getMeasuredHeight() / 2.0f) + figmaTextView22222222.getTop() + top22222222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 10:
                        valueOf = Integer.valueOf(ColorUtils.setAlphaComponent(this.colorPalette.error, 31));
                        valueOf2 = Integer.valueOf(this.colorPalette.error);
                        num = valueOf;
                        drawable = null;
                        valueOf3 = valueOf2;
                        ItemView itemView222222222 = (ItemView) view;
                        float top222222222 = itemView222222222.getTop();
                        FigmaTextView figmaTextView222222222 = itemView222222222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView222222222.getMeasuredHeight() / 2.0f) + figmaTextView222222222.getTop() + top222222222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 11:
                        valueOf6 = Integer.valueOf(this.colorPalette.tint);
                        valueOf4 = Integer.valueOf(this.colorPalette.tint);
                        drawable2 = timelineDrawing.completeDrawable;
                        valueOf3 = valueOf4;
                        num = valueOf6;
                        drawable = drawable2;
                        ItemView itemView2222222222 = (ItemView) view;
                        float top2222222222 = itemView2222222222.getTop();
                        FigmaTextView figmaTextView2222222222 = itemView2222222222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView2222222222.getMeasuredHeight() / 2.0f) + figmaTextView2222222222.getTop() + top2222222222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    case 12:
                        valueOf6 = Integer.valueOf(this.colorPalette.error);
                        valueOf4 = Integer.valueOf(this.colorPalette.error);
                        drawable2 = timelineDrawing.missedDrawable;
                        valueOf3 = valueOf4;
                        num = valueOf6;
                        drawable = drawable2;
                        ItemView itemView22222222222 = (ItemView) view;
                        float top22222222222 = itemView22222222222.getTop();
                        FigmaTextView figmaTextView22222222222 = itemView22222222222.primaryTextView;
                        arrayList2.add(new TimelineDrawing.Element((figmaTextView22222222222.getMeasuredHeight() / 2.0f) + figmaTextView22222222222.getTop() + top22222222222, i, num, valueOf3, drawable));
                        i2 = i3;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                }
                return;
            }
        }
    }
}
