package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.N;
import com.yandex.div.R$dimen;
import com.yandex.div.R$drawable;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class OverflowMenuWrapper {
    private int mButtonResourceId;

    @NonNull
    private final Context mContext;
    private View[] mHorizontallyCompetingViews;
    private Listener mListener;
    private int mMenuGravity;
    private final int mMenuHorizontalMargin;
    private final int mMenuVerticalMargin;
    private int mOverflowAlpha;
    private int mOverflowColor;
    private int mOverflowGravity;
    private final ViewGroup mParentView;
    private N mPopupMenu;
    private boolean mValid;
    private View[] mVerticallyCompetingViews;

    @NonNull
    private final View mWrappedView;

    public interface Listener {

        public static class Simple implements Listener {
            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            public void onPopupShown() {
            }
        }

        void onMenuCreated(@NonNull N n4);

        void onPopupShown();
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, ViewGroup viewGroup) {
        this(context, view, viewGroup, R$dimen.overflow_menu_margin_horizontal, R$dimen.overflow_menu_margin_vertical);
    }

    public static /* synthetic */ void a(OverflowMenuWrapper overflowMenuWrapper, View view) {
        overflowMenuWrapper.getClass();
        N n4 = new N(view.getContext(), view, overflowMenuWrapper.mMenuGravity);
        Listener listener = overflowMenuWrapper.mListener;
        if (listener != null) {
            listener.onMenuCreated(n4);
        }
        n4.b();
        Listener listener2 = overflowMenuWrapper.mListener;
        if (listener2 != null) {
            listener2.onPopupShown();
        }
        overflowMenuWrapper.mPopupMenu = n4;
    }

    public View.OnClickListener getOnMenuClickListener() {
        return new View.OnClickListener() { // from class: J1.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverflowMenuWrapper.a(OverflowMenuWrapper.this, view);
            }
        };
    }

    @NonNull
    public OverflowMenuWrapper listener(@NonNull Listener listener) {
        this.mListener = listener;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper overflowGravity(int i4) {
        this.mOverflowGravity = i4;
        return this;
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, ViewGroup viewGroup, int i4, int i5) {
        this.mOverflowGravity = 51;
        this.mOverflowColor = -1;
        this.mOverflowAlpha = KotlinVersion.MAX_COMPONENT_VALUE;
        this.mMenuGravity = 83;
        this.mButtonResourceId = R$drawable.ic_more_vert_white_24dp;
        this.mHorizontallyCompetingViews = null;
        this.mVerticallyCompetingViews = null;
        this.mValid = false;
        this.mContext = context;
        this.mWrappedView = view;
        this.mParentView = viewGroup;
        this.mMenuHorizontalMargin = i4;
        this.mMenuVerticalMargin = i5;
    }
}
