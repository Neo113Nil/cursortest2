package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutDebugModelBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llContent;

    @NonNull
    public final LinearLayout llProviderType;

    @NonNull
    private final ScrollView rootView;

    @NonNull
    public final Spinner spinnerProviderType;

    @NonNull
    public final TextView tvAppVersion;

    @NonNull
    public final TextView tvElapsedTime;

    @NonNull
    public final TextView tvFirmwareVersion;

    @NonNull
    public final TextView tvHandle;

    @NonNull
    public final TextView tvIsMacAuthorized;

    @NonNull
    public final TextView tvIsOversea;

    @NonNull
    public final TextView tvIsStream;

    @NonNull
    public final TextView tvMac;

    @NonNull
    public final TextView tvProviderType;

    @NonNull
    public final TextView tvReq;

    @NonNull
    public final TextView tvResp;

    @NonNull
    public final TextView tvWatchCallbackMsg;

    private LayoutDebugModelBinding(@NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull Spinner spinner, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12) {
        this.rootView = scrollView;
        this.llContent = linearLayout;
        this.llProviderType = linearLayout2;
        this.spinnerProviderType = spinner;
        this.tvAppVersion = textView;
        this.tvElapsedTime = textView2;
        this.tvFirmwareVersion = textView3;
        this.tvHandle = textView4;
        this.tvIsMacAuthorized = textView5;
        this.tvIsOversea = textView6;
        this.tvIsStream = textView7;
        this.tvMac = textView8;
        this.tvProviderType = textView9;
        this.tvReq = textView10;
        this.tvResp = textView11;
        this.tvWatchCallbackMsg = textView12;
    }

    @NonNull
    public static LayoutDebugModelBinding bind(@NonNull View view) {
        int i8 = R.id.ll_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content);
        if (linearLayout != null) {
            i8 = R.id.ll_provider_type;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_provider_type);
            if (linearLayout2 != null) {
                i8 = R.id.spinner_provider_type;
                Spinner spinner = (Spinner) ViewBindings.findChildViewById(view, R.id.spinner_provider_type);
                if (spinner != null) {
                    i8 = R.id.tv_app_version;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_version);
                    if (textView != null) {
                        i8 = R.id.tv_elapsed_time;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_elapsed_time);
                        if (textView2 != null) {
                            i8 = R.id.tv_firmware_version;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_firmware_version);
                            if (textView3 != null) {
                                i8 = R.id.tv_handle;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_handle);
                                if (textView4 != null) {
                                    i8 = R.id.tv_is_mac_authorized;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_is_mac_authorized);
                                    if (textView5 != null) {
                                        i8 = R.id.tv_is_oversea;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_is_oversea);
                                        if (textView6 != null) {
                                            i8 = R.id.tv_is_stream;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_is_stream);
                                            if (textView7 != null) {
                                                i8 = R.id.tv_mac;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mac);
                                                if (textView8 != null) {
                                                    i8 = R.id.tv_provider_type;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_provider_type);
                                                    if (textView9 != null) {
                                                        i8 = R.id.tv_req;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_req);
                                                        if (textView10 != null) {
                                                            i8 = R.id.tv_resp;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_resp);
                                                            if (textView11 != null) {
                                                                i8 = R.id.tv_watch_callback_msg;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_callback_msg);
                                                                if (textView12 != null) {
                                                                    return new LayoutDebugModelBinding((ScrollView) view, linearLayout, linearLayout2, spinner, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
    public static LayoutDebugModelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutDebugModelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_debug_model, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
