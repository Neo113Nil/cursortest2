package com.crrepa.band.my.device.ai.debugmodel;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.artillery.ctc.CtHelper;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.moyoung.dafit.module.common.utils.x0;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class d {
    private static final int CLICK_COUNT = 10;
    private static final long CLICK_INTERVAL = 500;
    private int clickCount = 0;
    private final long[] clickTimes = new long[10];
    private boolean inDebugMode = false;
    private long requestTime;
    private final ViewGroup rootView;
    private TextView tvElapsedTime;
    private TextView tvReq;
    private TextView tvResp;
    private TextView tvWatchCallback;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
            AIProvider.saveProviderType(i8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public d(ViewGroup viewGroup, View view) {
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.rootView = viewGroup;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.debugmodel.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d.this.lambda$new$0(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        onClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$renderDebugModel$1(LinearLayout linearLayout, View view) {
        if (linearLayout.getVisibility() == 0) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    @SuppressLint({"SetTextI18n"})
    private void renderDebugModel() {
        View inflate = LayoutInflater.from(this.rootView.getContext()).inflate(R.layout.layout_debug_model, this.rootView, false);
        this.rootView.addView(inflate);
        this.tvReq = (TextView) inflate.findViewById(R.id.tv_req);
        this.tvResp = (TextView) inflate.findViewById(R.id.tv_resp);
        this.tvWatchCallback = (TextView) inflate.findViewById(R.id.tv_watch_callback_msg);
        this.tvElapsedTime = (TextView) inflate.findViewById(R.id.tv_elapsed_time);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_mac);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_firmware_version);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_app_version);
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_is_mac_authorized);
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_is_oversea);
        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_is_stream);
        textView.setText("Watch Mac=" + com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress());
        textView2.setText("Firmware Version=" + com.crrepa.band.my.ble.band.utils.a.getInstance().getFirmwareVersion());
        textView3.setText("App Version=" + com.moyoung.dafit.module.common.utils.f.getAppVersion(com.moyoung.dafit.module.common.utils.d.get()));
        textView6.setText("Watch Is Stream Response=" + AIProvider.isStreamChat());
        textView4.setText("Is Mac Authorized=" + (com.crrepa.band.my.device.ai.helper.d.isUnauthorizedAndShowTips() ^ true));
        if (AIProvider.getProviderType() == 0) {
            textView5.setText("Is Oversea=" + CtHelper.Companion.get().isOverseas());
        }
        final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_content);
        inflate.findViewById(R.id.tv_handle).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.debugmodel.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.lambda$renderDebugModel$1(linearLayout, view);
            }
        });
        renderSpinner(inflate);
    }

    private void renderSpinner(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_provider_type);
        final Spinner spinner = (Spinner) view.findViewById(R.id.spinner_provider_type);
        TextView textView = (TextView) view.findViewById(R.id.tv_provider_type);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.debugmodel.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                spinner.setVisibility(0);
            }
        });
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.rootView.getContext(), android.R.layout.simple_spinner_item, new String[]{"Huaqiao", "AFlash", "Moyoung"});
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        textView.setText("AI Provider: " + AIProvider.getProviderType());
        if (AIProvider.getProviderType() < 3) {
            spinner.setSelection(AIProvider.getProviderType());
        }
        spinner.setOnItemSelectedListener(new a());
    }

    public void destroy() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onAIRequestEvent(e eVar) {
        if (this.inDebugMode) {
            this.tvReq.setText(eVar.msg);
            this.tvResp.setText("");
            this.tvElapsedTime.setText("");
            this.requestTime = System.currentTimeMillis();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    @SuppressLint({"DefaultLocale"})
    public void onAIResponseEvent(f fVar) {
        if (this.inDebugMode) {
            if (x0.isNotEmpty(fVar.msg) && !"\"\"".equals(fVar.msg)) {
                this.tvResp.setText("状态码:" + fVar.statusCode + "\n" + fVar.msg);
            }
            if (this.requestTime != 0) {
                this.tvElapsedTime.setText(String.format("Elapsed Time=%dms", Long.valueOf(System.currentTimeMillis() - this.requestTime)));
            }
        }
    }

    public void onClick() {
        if (this.inDebugMode) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i8 = this.clickCount;
        if (i8 > 0) {
            long[] jArr = this.clickTimes;
            if (elapsedRealtime - jArr[i8 - 1] > 500) {
                this.clickCount = 1;
                jArr[0] = elapsedRealtime;
                return;
            }
        }
        long[] jArr2 = this.clickTimes;
        int i9 = i8 + 1;
        this.clickCount = i9;
        jArr2[i8] = elapsedRealtime;
        if (i9 == 10) {
            this.clickCount = 0;
            this.inDebugMode = true;
            renderDebugModel();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(g gVar) {
        if (this.inDebugMode) {
            this.tvWatchCallback.setText(gVar.msg);
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(com.crrepa.band.my.device.ai.b bVar) {
        if (this.inDebugMode) {
            renderDebugModel();
        }
    }
}
