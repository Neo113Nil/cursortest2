package com.onesignal.core.internal.http;

import com.onesignal.core.internal.http.impl.OptionalHeaders;
import k4.InterfaceC1218d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IHttpClient {

    public static final class DefaultImpls {
        public static /* synthetic */ Object delete$default(IHttpClient iHttpClient, String str, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i2 & 2) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.delete(str, optionalHeaders, interfaceC1218d);
        }

        public static /* synthetic */ Object get$default(IHttpClient iHttpClient, String str, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i2 & 2) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.get(str, optionalHeaders, interfaceC1218d);
        }

        public static /* synthetic */ Object patch$default(IHttpClient iHttpClient, String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
            }
            if ((i2 & 4) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.patch(str, jSONObject, optionalHeaders, interfaceC1218d);
        }

        public static /* synthetic */ Object post$default(IHttpClient iHttpClient, String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
            }
            if ((i2 & 4) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.post(str, jSONObject, optionalHeaders, interfaceC1218d);
        }

        public static /* synthetic */ Object put$default(IHttpClient iHttpClient, String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
            }
            if ((i2 & 4) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.put(str, jSONObject, optionalHeaders, interfaceC1218d);
        }
    }

    Object delete(String str, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d);

    Object get(String str, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d);

    Object patch(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d);

    Object post(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d);

    Object put(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d);
}
