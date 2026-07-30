package com.drake.net.interfaces;

import android.view.View;
import com.drake.net.NetConfig;
import com.drake.net.R$string;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.DownloadFileException;
import com.drake.net.exception.HttpFailureException;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.NetSocketTimeoutException;
import com.drake.net.exception.NoCacheException;
import com.drake.net.exception.RequestParamsException;
import com.drake.net.exception.ResponseException;
import com.drake.net.exception.ServerResponseException;
import com.drake.net.exception.URLParseException;
import com.drake.net.utils.TipUtils;
import java.net.UnknownHostException;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public interface b {
    public static final a DEFAULT = a.$$INSTANCE;

    public static final class a implements b {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }

        @Override // com.drake.net.interfaces.b
        public void onError(Throwable th) {
            C0260b.onError(this, th);
        }

        @Override // com.drake.net.interfaces.b
        public void onStateError(Throwable th, View view) {
            C0260b.onStateError(this, th, view);
        }
    }

    /* renamed from: com.drake.net.interfaces.b$b, reason: collision with other inner class name */
    public static final class C0260b {
        public static void onError(b bVar, Throwable e8) {
            s.checkNotNullParameter(e8, "e");
            String string = e8 instanceof UnknownHostException ? NetConfig.INSTANCE.getApp().getString(R$string.net_host_error) : e8 instanceof URLParseException ? NetConfig.INSTANCE.getApp().getString(R$string.net_url_error) : e8 instanceof NetConnectException ? NetConfig.INSTANCE.getApp().getString(R$string.net_connect_error) : e8 instanceof NetSocketTimeoutException ? NetConfig.INSTANCE.getApp().getString(R$string.net_connect_timeout_error, e8.getMessage()) : e8 instanceof DownloadFileException ? NetConfig.INSTANCE.getApp().getString(R$string.net_download_error) : e8 instanceof ConvertException ? NetConfig.INSTANCE.getApp().getString(R$string.net_parse_error) : e8 instanceof RequestParamsException ? NetConfig.INSTANCE.getApp().getString(R$string.net_request_error) : e8 instanceof ServerResponseException ? NetConfig.INSTANCE.getApp().getString(R$string.net_server_error) : e8 instanceof NullPointerException ? NetConfig.INSTANCE.getApp().getString(R$string.net_null_error) : e8 instanceof NoCacheException ? NetConfig.INSTANCE.getApp().getString(R$string.net_no_cache_error) : e8 instanceof ResponseException ? e8.getMessage() : e8 instanceof HttpFailureException ? NetConfig.INSTANCE.getApp().getString(R$string.request_failure) : e8 instanceof NetException ? NetConfig.INSTANCE.getApp().getString(R$string.net_error) : NetConfig.INSTANCE.getApp().getString(R$string.net_other_error);
            com.drake.net.a.debug(e8);
            TipUtils.toast(string);
        }

        public static void onStateError(b bVar, Throwable e8, View view) {
            s.checkNotNullParameter(e8, "e");
            s.checkNotNullParameter(view, "view");
            if ((e8 instanceof ConvertException) || (e8 instanceof RequestParamsException) || (e8 instanceof ResponseException) || (e8 instanceof NullPointerException)) {
                bVar.onError(e8);
            } else {
                com.drake.net.a.debug(e8);
            }
        }
    }

    void onError(Throwable th);

    void onStateError(Throwable th, View view);
}
