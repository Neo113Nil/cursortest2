package com.bykv.vk.openvk.component.video.pvs.icD.NB;

import com.bykv.vk.openvk.component.video.pvs.icD.Mxy;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.card.MaterialCardViewHelper;
import java.io.InputStream;
import java.util.List;

/* compiled from: AbsResponseWrapper.java */
/* loaded from: classes.dex */
public abstract class pvs {
    NB icD;
    List<Mxy.icD> pvs;

    public abstract InputStream Jd();

    public abstract String NB();

    public abstract boolean icD();

    public abstract int pvs();

    protected String pvs(int i) {
        switch (i) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i) {
                    case MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION /* 300 */:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (i) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case TTAdConstant.DEEPLINK_FALLBACK_CODE /* 404 */:
                                return "Not Found";
                            case TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE /* 405 */:
                                return "Method Not Allowed";
                            case TTAdConstant.LANDING_PAGE_TYPE_CODE /* 406 */:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /* 407 */:
                                return "Proxy Authentication Required";
                            case TTAdConstant.DOWNLOAD_URL_CODE /* 408 */:
                                return "Request Time-Out";
                            case TTAdConstant.IMAGE_LIST_CODE /* 409 */:
                                return "Conflict";
                            case TTAdConstant.IMAGE_LIST_SIZE_CODE /* 410 */:
                                return "Gone";
                            case TTAdConstant.IMAGE_CODE /* 411 */:
                                return "Length Required";
                            case TTAdConstant.IMAGE_URL_CODE /* 412 */:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /* 414 */:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                                return "Unsupported Media Type";
                            default:
                                switch (i) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public abstract String pvs(String str, String str2);

    public abstract String sUS();

    public abstract List<Mxy.icD> vG();

    public NB yiw() {
        return this.icD;
    }

    protected Mxy.icD pvs(String str) {
        List<Mxy.icD> list;
        if (str != null && (list = this.pvs) != null && list.size() > 0) {
            for (Mxy.icD icd : this.pvs) {
                if (str.equals(icd.pvs)) {
                    return icd;
                }
            }
        }
        return null;
    }
}
