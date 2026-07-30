package com.google.maps.android;

import com.baidu.mapapi.http.wrapper.HttpManager;
import f6.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.i0;
import y5.g;
import y5.w;

@d(c = "com.google.maps.android.StreetViewUtils$Companion$fetchStreetViewData$2", f = "StreetViewUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class StreetViewUtils$Companion$fetchStreetViewData$2 extends SuspendLambda implements p {
    final /* synthetic */ String $urlString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StreetViewUtils$Companion$fetchStreetViewData$2(String str, c cVar) {
        super(2, cVar);
        this.$urlString = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c create(Object obj, c cVar) {
        return new StreetViewUtils$Companion$fetchStreetViewData$2(this.$urlString, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ResponseStreetView deserializeResponse;
        b.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.throwOnFailure(obj);
        try {
            URLConnection openConnection = new URL(this.$urlString).openConnection();
            s.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod(HttpManager.HTTP_GET);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("HTTP Error: " + responseCode);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                kotlin.io.b.closeFinally(bufferedReader, null);
                bufferedReader.close();
                inputStream.close();
                deserializeResponse = StreetViewUtils.Companion.deserializeResponse(readText);
                return deserializeResponse.getStatus();
            } finally {
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            throw new IOException("Network error: " + e8.getMessage());
        }
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, c cVar) {
        return ((StreetViewUtils$Companion$fetchStreetViewData$2) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
