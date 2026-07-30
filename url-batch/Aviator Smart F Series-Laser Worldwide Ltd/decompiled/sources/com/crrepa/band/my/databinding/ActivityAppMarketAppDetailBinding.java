package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityAppMarketAppDetailBinding implements ViewBinding {

    @NonNull
    public final ItemAppMarketAppBinding includeBaseMsg;

    @NonNull
    public final ProgressBar pb;

    @NonNull
    public final RelativeLayout rlOperation;

    @NonNull
    public final RelativeLayout rlTitleBar;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvPreview;

    @NonNull
    public final ShadowLayout shadowInstall;

    @NonNull
    public final ShadowLayout shadowUpdate;

    @NonNull
    public final TextView tvAppInfoTitle;

    @NonNull
    public final TextView tvBack;

    @NonNull
    public final TextView tvDeveloper;

    @NonNull
    public final TextView tvDeveloperTitle;

    @NonNull
    public final TextView tvInstalled;

    @NonNull
    public final TextView tvIntroduction;

    @NonNull
    public final TextView tvProgress;

    @NonNull
    public final TextView tvReleaseDate;

    @NonNull
    public final TextView tvReleaseDateTitle;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTitleUninstall;

    @NonNull
    public final TextView tvUninstall;

    @NonNull
    public final TextView tvUpdateMsg;

    @NonNull
    public final TextView tvVersion;

    @NonNull
    public final TextView tvVersionTitle;

    private ActivityAppMarketAppDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull ItemAppMarketAppBinding itemAppMarketAppBinding, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RecyclerView recyclerView, @NonNull ShadowLayout shadowLayout, @NonNull ShadowLayout shadowLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15) {
        this.rootView = relativeLayout;
        this.includeBaseMsg = itemAppMarketAppBinding;
        this.pb = progressBar;
        this.rlOperation = relativeLayout2;
        this.rlTitleBar = relativeLayout3;
        this.rvPreview = recyclerView;
        this.shadowInstall = shadowLayout;
        this.shadowUpdate = shadowLayout2;
        this.tvAppInfoTitle = textView;
        this.tvBack = textView2;
        this.tvDeveloper = textView3;
        this.tvDeveloperTitle = textView4;
        this.tvInstalled = textView5;
        this.tvIntroduction = textView6;
        this.tvProgress = textView7;
        this.tvReleaseDate = textView8;
        this.tvReleaseDateTitle = textView9;
        this.tvTitle = textView10;
        this.tvTitleUninstall = textView11;
        this.tvUninstall = textView12;
        this.tvUpdateMsg = textView13;
        this.tvVersion = textView14;
        this.tvVersionTitle = textView15;
    }

    @NonNull
    public static ActivityAppMarketAppDetailBinding bind(@NonNull View view) {
        int i8 = R.id.include_base_msg;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_base_msg);
        if (findChildViewById != null) {
            ItemAppMarketAppBinding bind = ItemAppMarketAppBinding.bind(findChildViewById);
            i8 = R.id.pb;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb);
            if (progressBar != null) {
                i8 = R.id.rl_operation;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_operation);
                if (relativeLayout != null) {
                    i8 = R.id.rl_title_bar;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title_bar);
                    if (relativeLayout2 != null) {
                        i8 = R.id.rv_preview;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_preview);
                        if (recyclerView != null) {
                            i8 = R.id.shadow_install;
                            ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_install);
                            if (shadowLayout != null) {
                                i8 = R.id.shadow_update;
                                ShadowLayout shadowLayout2 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_update);
                                if (shadowLayout2 != null) {
                                    i8 = R.id.tv_app_info_title;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_info_title);
                                    if (textView != null) {
                                        i8 = R.id.tv_back;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_back);
                                        if (textView2 != null) {
                                            i8 = R.id.tv_developer;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_developer);
                                            if (textView3 != null) {
                                                i8 = R.id.tv_developer_title;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_developer_title);
                                                if (textView4 != null) {
                                                    i8 = R.id.tv_installed;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_installed);
                                                    if (textView5 != null) {
                                                        i8 = R.id.tv_introduction;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_introduction);
                                                        if (textView6 != null) {
                                                            i8 = R.id.tv_progress;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress);
                                                            if (textView7 != null) {
                                                                i8 = R.id.tv_release_date;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_release_date);
                                                                if (textView8 != null) {
                                                                    i8 = R.id.tv_release_date_title;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_release_date_title);
                                                                    if (textView9 != null) {
                                                                        i8 = R.id.tv_title;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                        if (textView10 != null) {
                                                                            i8 = R.id.tv_title_uninstall;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_uninstall);
                                                                            if (textView11 != null) {
                                                                                i8 = R.id.tv_uninstall;
                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_uninstall);
                                                                                if (textView12 != null) {
                                                                                    i8 = R.id.tv_update_msg;
                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_update_msg);
                                                                                    if (textView13 != null) {
                                                                                        i8 = R.id.tv_version;
                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version);
                                                                                        if (textView14 != null) {
                                                                                            i8 = R.id.tv_version_title;
                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version_title);
                                                                                            if (textView15 != null) {
                                                                                                return new ActivityAppMarketAppDetailBinding((RelativeLayout) view, bind, progressBar, relativeLayout, relativeLayout2, recyclerView, shadowLayout, shadowLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityAppMarketAppDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAppMarketAppDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_app_market_app_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
