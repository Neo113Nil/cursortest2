package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityBackgroundRunBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding appbar;

    @NonNull
    public final RelativeLayout backgroundRunPermission;

    @NonNull
    public final RelativeLayout batteryWhiteList;

    @NonNull
    public final Button btnBackgroundRunPermission;

    @NonNull
    public final Button btnLocationPermission;

    @NonNull
    public final Button btnSystemBatteryWhiteList;

    @NonNull
    public final Button btnVendorBatteryWhiteList;

    @NonNull
    public final RelativeLayout clBackgroundRunPermission;

    @NonNull
    public final RelativeLayout clBatteryWhiteList;

    @NonNull
    public final RelativeLayout clLocationPermission;

    @NonNull
    public final ConstraintLayout clLock;

    @NonNull
    public final RelativeLayout clVendorWhiteList;

    @NonNull
    public final ImageView ivBackgroundLockContinue;

    @NonNull
    public final ImageView ivBackgroundRunContinue;

    @NonNull
    public final ImageView ivBatterySystemContinue;

    @NonNull
    public final ImageView ivBatteryVendorContinue;

    @NonNull
    public final ImageView ivLocationPermissionContinue;

    @NonNull
    public final LinearLayout llBackgroundSetting;

    @NonNull
    public final RelativeLayout locationPermission;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvBackgroundLock;

    @NonNull
    public final TextView tvBackgroundLockHint;

    @NonNull
    public final TextView tvBackgroundRun;

    @NonNull
    public final TextView tvBackgroundRunHint;

    @NonNull
    public final TextView tvBatterySystem;

    @NonNull
    public final TextView tvBatterySystemHint;

    @NonNull
    public final TextView tvBatteryVendor;

    @NonNull
    public final TextView tvBatteryVendorHint;

    @NonNull
    public final TextView tvLocationPermission;

    @NonNull
    public final TextView tvLocationPermissionHint;

    @NonNull
    public final TextView tvOtherSecurityHint;

    @NonNull
    public final RelativeLayout vendorWhiteList;

    private ActivityBackgroundRunBinding(@NonNull LinearLayout linearLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull ConstraintLayout constraintLayout, @NonNull RelativeLayout relativeLayout6, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout7, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull RelativeLayout relativeLayout8) {
        this.rootView = linearLayout;
        this.appbar = bandDataAppbarBinding;
        this.backgroundRunPermission = relativeLayout;
        this.batteryWhiteList = relativeLayout2;
        this.btnBackgroundRunPermission = button;
        this.btnLocationPermission = button2;
        this.btnSystemBatteryWhiteList = button3;
        this.btnVendorBatteryWhiteList = button4;
        this.clBackgroundRunPermission = relativeLayout3;
        this.clBatteryWhiteList = relativeLayout4;
        this.clLocationPermission = relativeLayout5;
        this.clLock = constraintLayout;
        this.clVendorWhiteList = relativeLayout6;
        this.ivBackgroundLockContinue = imageView;
        this.ivBackgroundRunContinue = imageView2;
        this.ivBatterySystemContinue = imageView3;
        this.ivBatteryVendorContinue = imageView4;
        this.ivLocationPermissionContinue = imageView5;
        this.llBackgroundSetting = linearLayout2;
        this.locationPermission = relativeLayout7;
        this.tvBackgroundLock = textView;
        this.tvBackgroundLockHint = textView2;
        this.tvBackgroundRun = textView3;
        this.tvBackgroundRunHint = textView4;
        this.tvBatterySystem = textView5;
        this.tvBatterySystemHint = textView6;
        this.tvBatteryVendor = textView7;
        this.tvBatteryVendorHint = textView8;
        this.tvLocationPermission = textView9;
        this.tvLocationPermissionHint = textView10;
        this.tvOtherSecurityHint = textView11;
        this.vendorWhiteList = relativeLayout8;
    }

    @NonNull
    public static ActivityBackgroundRunBinding bind(@NonNull View view) {
        int i8 = R.id.appbar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.appbar);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            i8 = R.id.background_run_permission;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.background_run_permission);
            if (relativeLayout != null) {
                i8 = R.id.battery_white_list;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.battery_white_list);
                if (relativeLayout2 != null) {
                    i8 = R.id.btn_background_run_permission;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_background_run_permission);
                    if (button != null) {
                        i8 = R.id.btn_location_permission;
                        Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_location_permission);
                        if (button2 != null) {
                            i8 = R.id.btn_system_battery_white_list;
                            Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_system_battery_white_list);
                            if (button3 != null) {
                                i8 = R.id.btn_vendor_battery_white_list;
                                Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.btn_vendor_battery_white_list);
                                if (button4 != null) {
                                    i8 = R.id.cl_background_run_permission;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.cl_background_run_permission);
                                    if (relativeLayout3 != null) {
                                        i8 = R.id.cl_battery_white_list;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.cl_battery_white_list);
                                        if (relativeLayout4 != null) {
                                            i8 = R.id.cl_location_permission;
                                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.cl_location_permission);
                                            if (relativeLayout5 != null) {
                                                i8 = R.id.cl_lock;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_lock);
                                                if (constraintLayout != null) {
                                                    i8 = R.id.cl_vendor_white_list;
                                                    RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.cl_vendor_white_list);
                                                    if (relativeLayout6 != null) {
                                                        i8 = R.id.iv_background_lock_continue;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_background_lock_continue);
                                                        if (imageView != null) {
                                                            i8 = R.id.iv_background_run_continue;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_background_run_continue);
                                                            if (imageView2 != null) {
                                                                i8 = R.id.iv_battery_system_continue;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_battery_system_continue);
                                                                if (imageView3 != null) {
                                                                    i8 = R.id.iv_battery_vendor_continue;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_battery_vendor_continue);
                                                                    if (imageView4 != null) {
                                                                        i8 = R.id.iv_location_permission_continue;
                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_location_permission_continue);
                                                                        if (imageView5 != null) {
                                                                            i8 = R.id.ll_background_setting;
                                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_background_setting);
                                                                            if (linearLayout != null) {
                                                                                i8 = R.id.location_permission;
                                                                                RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.location_permission);
                                                                                if (relativeLayout7 != null) {
                                                                                    i8 = R.id.tv_background_lock;
                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_background_lock);
                                                                                    if (textView != null) {
                                                                                        i8 = R.id.tv_background_lock_hint;
                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_background_lock_hint);
                                                                                        if (textView2 != null) {
                                                                                            i8 = R.id.tv_background_run;
                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_background_run);
                                                                                            if (textView3 != null) {
                                                                                                i8 = R.id.tv_background_run_hint;
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_background_run_hint);
                                                                                                if (textView4 != null) {
                                                                                                    i8 = R.id.tv_battery_system;
                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_battery_system);
                                                                                                    if (textView5 != null) {
                                                                                                        i8 = R.id.tv_battery_system_hint;
                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_battery_system_hint);
                                                                                                        if (textView6 != null) {
                                                                                                            i8 = R.id.tv_battery_vendor;
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_battery_vendor);
                                                                                                            if (textView7 != null) {
                                                                                                                i8 = R.id.tv_battery_vendor_hint;
                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_battery_vendor_hint);
                                                                                                                if (textView8 != null) {
                                                                                                                    i8 = R.id.tv_location_permission;
                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_location_permission);
                                                                                                                    if (textView9 != null) {
                                                                                                                        i8 = R.id.tv_location_permission_hint;
                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_location_permission_hint);
                                                                                                                        if (textView10 != null) {
                                                                                                                            i8 = R.id.tv_other_security_hint;
                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_other_security_hint);
                                                                                                                            if (textView11 != null) {
                                                                                                                                i8 = R.id.vendor_white_list;
                                                                                                                                RelativeLayout relativeLayout8 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.vendor_white_list);
                                                                                                                                if (relativeLayout8 != null) {
                                                                                                                                    return new ActivityBackgroundRunBinding((LinearLayout) view, bind, relativeLayout, relativeLayout2, button, button2, button3, button4, relativeLayout3, relativeLayout4, relativeLayout5, constraintLayout, relativeLayout6, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout7, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, relativeLayout8);
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
    public static ActivityBackgroundRunBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBackgroundRunBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_background_run, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
