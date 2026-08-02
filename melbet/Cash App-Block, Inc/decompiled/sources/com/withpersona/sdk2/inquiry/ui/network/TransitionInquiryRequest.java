package com.withpersona.sdk2.inquiry.ui.network;

import android.content.ContentResolver;
import android.net.Uri;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.nfc.ChipAuthenticationStatus;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.UnsignedKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "", "Data", "Attributes", "Meta", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransitionInquiryRequest {
    public final Data data;
    public final Meta meta;

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes {
        public final Map componentParams;

        public Attributes(Map map) {
            this.componentParams = map;
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {
        public final Attributes attributes;

        public Data(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    public TransitionInquiryRequest(Data data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public final ArrayList toMultipartParts(String str, ContentResolver contentResolver) {
        String str2;
        byte[] readBytes;
        MediaType mediaType;
        ArrayList arrayList = new ArrayList();
        arrayList.add(MultipartBody.Part.Companion.createFormData("data[id]", str));
        arrayList.add(MultipartBody.Part.Companion.createFormData("data[type]", "inquiry"));
        Meta meta = this.meta;
        arrayList.add(MultipartBody.Part.Companion.createFormData("meta[fromComponent]", meta.fromComponent));
        arrayList.add(MultipartBody.Part.Companion.createFormData("meta[fromStep]", meta.fromStep));
        String str3 = meta.shareToken;
        if (str3 != null) {
            arrayList.add(MultipartBody.Part.Companion.createFormData("meta[shareToken]", str3));
        }
        Map map = this.data.attributes.componentParams;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                ComponentParam componentParam = (ComponentParam) entry.getValue();
                String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][componentParams][", str4, "]");
                if (componentParam instanceof ComponentParam.ComponentString) {
                    arrayList.add(MultipartBody.Part.Companion.createFormData(m, ((ComponentParam.ComponentString) componentParam).value));
                } else if (componentParam instanceof ComponentParam.ComponentStringList) {
                    List list = ((ComponentParam.ComponentStringList) componentParam).value;
                    if (list.isEmpty()) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[]"), ""));
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[]"), (String) it.next()));
                        }
                    }
                } else if (componentParam instanceof ComponentParam.ComponentBoolean) {
                    arrayList.add(MultipartBody.Part.Companion.createFormData(m, String.valueOf(((ComponentParam.ComponentBoolean) componentParam).value)));
                } else if (componentParam instanceof ComponentParam.ComponentNumber) {
                    arrayList.add(MultipartBody.Part.Companion.createFormData(m, ((ComponentParam.ComponentNumber) componentParam).value.toString()));
                } else if (componentParam instanceof ComponentParam.Address) {
                    ComponentParam.Address address = (ComponentParam.Address) componentParam;
                    String str5 = address.street1;
                    if (str5 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[street_1]"), str5));
                    }
                    String str6 = address.street2;
                    if (str6 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[street_2]"), str6));
                    }
                    String str7 = address.city;
                    if (str7 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[city]"), str7));
                    }
                    String str8 = address.subdivision;
                    if (str8 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[subdivision]"), str8));
                    }
                    String str9 = address.postalCode;
                    if (str9 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[postal_code]"), str9));
                    }
                } else if (componentParam instanceof ComponentParam.ESignature) {
                    String str10 = ((ComponentParam.ESignature) componentParam).signatureImageString;
                    if (str10 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m, str10));
                    }
                } else if (componentParam instanceof ComponentParam.GovernmentIdNfcScan) {
                    ComponentParam.GovernmentIdNfcScan governmentIdNfcScan = (ComponentParam.GovernmentIdNfcScan) componentParam;
                    ChipAuthenticationStatus chipAuthenticationStatus = governmentIdNfcScan.chipAuthenticationStatus;
                    if (chipAuthenticationStatus != null) {
                        int ordinal = chipAuthenticationStatus.ordinal();
                        if (ordinal == 0) {
                            str2 = "notRequested";
                        } else if (ordinal == 1) {
                            str2 = "notSupported";
                        } else if (ordinal == 2) {
                            str2 = "failed";
                        } else {
                            if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str2 = "success";
                        }
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[caFlag]"), str2));
                    }
                    String str11 = governmentIdNfcScan.dg1;
                    if (str11 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[dg1]"), str11));
                    }
                    String str12 = governmentIdNfcScan.dg2;
                    if (str12 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[dg2]"), str12));
                    }
                    String str13 = governmentIdNfcScan.sod;
                    if (str13 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[sod]"), str13));
                    }
                } else if (componentParam instanceof ComponentParam.InternationalDbParams) {
                    ComponentParam.InternationalDbParams internationalDbParams = (ComponentParam.InternationalDbParams) componentParam;
                    String str14 = internationalDbParams.country;
                    if (str14 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[idb_country]"), str14));
                    }
                    String str15 = internationalDbParams.f1517type;
                    if (str15 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[idb_type]"), str15));
                    }
                    String str16 = internationalDbParams.value;
                    if (str16 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[idb_value]"), str16));
                    }
                } else if (componentParam instanceof ComponentParam.PhoneNumberSnaParams) {
                    ComponentParam.PhoneNumberSnaParams phoneNumberSnaParams = (ComponentParam.PhoneNumberSnaParams) componentParam;
                    String str17 = phoneNumberSnaParams.code;
                    if (str17 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[code]"), str17));
                    }
                    String str18 = phoneNumberSnaParams.errorName;
                    if (str18 != null) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[error][name]"), str18));
                        String concat = m.concat("[error][message]");
                        String str19 = phoneNumberSnaParams.errorMessage;
                        arrayList.add(MultipartBody.Part.Companion.createFormData(concat, str19 != null ? str19 : ""));
                    }
                } else {
                    if (!(componentParam instanceof ComponentParam.FileUpload)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ComponentParam.FileUpload fileUpload = (ComponentParam.FileUpload) componentParam;
                    ArrayList arrayList2 = fileUpload.uris;
                    if (!arrayList2.isEmpty() && contentResolver != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Uri uri = (Uri) it2.next();
                            String type2 = contentResolver.getType(uri);
                            if (type2 == null) {
                                type2 = "application/octet-stream";
                            }
                            InputStream openInputStream = contentResolver.openInputStream(uri);
                            if (openInputStream != null) {
                                try {
                                    readBytes = ByteStreamsKt.readBytes(openInputStream);
                                    openInputStream.close();
                                } finally {
                                }
                            } else {
                                readBytes = new byte[0];
                            }
                            RequestBody.Companion companion = RequestBody.Companion;
                            Regex regex = MediaType.TYPE_SUBTYPE;
                            try {
                                mediaType = UnsignedKt.get(type2);
                            } catch (IllegalArgumentException unused) {
                                mediaType = null;
                            }
                            RequestBody$Companion$toRequestBody$3 create$default = RequestBody.Companion.create$default(companion, readBytes, mediaType, 0, 6);
                            String lastPathSegment = uri.getLastPathSegment();
                            if (lastPathSegment == null) {
                                lastPathSegment = "file";
                            }
                            arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[]"), lastPathSegment, create$default));
                        }
                    } else if (fileUpload.hasPrefill) {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m, "USE PREVIOUS FILE"));
                    } else {
                        arrayList.add(MultipartBody.Part.Companion.createFormData(m.concat("[]"), ""));
                    }
                }
            }
        }
        return arrayList;
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Meta {
        public final String fromComponent;
        public final String fromStep;
        public final String shareToken;

        public Meta(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.fromComponent = str;
            this.fromStep = str2;
            this.shareToken = str3;
        }

        public /* synthetic */ Meta(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }
}
