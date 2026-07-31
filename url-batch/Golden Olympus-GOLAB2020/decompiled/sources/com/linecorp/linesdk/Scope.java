package com.linecorp.linesdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Scope {
    private static final String SCOPE_DELIMITER = " ";

    @NonNull
    private final String code;
    private static final Map<String, Scope> scopeInstanceMap = new HashMap();
    public static final Scope PROFILE = new Scope(Scopes.PROFILE);
    public static final Scope FRIEND = new Scope("friends");
    public static final Scope GROUP = new Scope("groups");
    public static final Scope MESSAGE = new Scope("message.write");
    public static final Scope OPENID_CONNECT = new Scope(Scopes.OPEN_ID);
    public static final Scope OC_EMAIL = new Scope(Scopes.EMAIL);
    public static final Scope OC_PHONE_NUMBER = new Scope("phone");
    public static final Scope OC_GENDER = new Scope("gender");
    public static final Scope OC_BIRTHDATE = new Scope("birthdate");
    public static final Scope OC_ADDRESS = new Scope("address");
    public static final Scope OC_REAL_NAME = new Scope("real_name");
    public static final Scope ONE_TIME_SHARE = new Scope("onetime.share");
    public static final Scope OPEN_CHAT_TERM_STATUS = new Scope("openchat.term.agreement.status");
    public static final Scope OPEN_CHAT_ROOM_CREATE_JOIN = new Scope("openchat.create.join");
    public static final Scope OPEN_CHAT_SUBSCRIPTION_INFO = new Scope("openchat.info");
    public static final Scope OPEN_CHAT_PLUG_MANAGEMENT = new Scope("openchatplug.managament");
    public static final Scope OPEN_CHAT_PLUG_INFO = new Scope("openchatplug.info");
    public static final Scope OPEN_CHAT_PLUG_PROFILE = new Scope("openchatplug.profile");
    public static final Scope OPEN_CHAT_PLUG_SEND_MESSAGE = new Scope("openchatplug.send.message");
    public static final Scope OPEN_CHAT_PLUG_RECEIVCE_MESSAGE_AND_EVENT = new Scope("openchatplug.receive.message.and.event");

    public Scope(@NonNull String str) {
        this.code = str;
        scopeInstanceMap.put(str, this);
    }

    public static List<String> convertToCodeList(List<Scope> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Scope> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().code);
        }
        return arrayList;
    }

    public static List<Scope> convertToScopeList(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Scope findScope = findScope(str);
            if (findScope != null) {
                arrayList.add(findScope);
            } else {
                arrayList.add(new Scope(str));
            }
        }
        return arrayList;
    }

    public static Scope findScope(String str) {
        return scopeInstanceMap.get(str);
    }

    public static String join(List<Scope> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(SCOPE_DELIMITER, convertToCodeList(list));
    }

    public static List<Scope> parseToList(String str) {
        return TextUtils.isEmpty(str) ? Collections.EMPTY_LIST : convertToScopeList(Arrays.asList(str.split(SCOPE_DELIMITER)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.code.equals(((Scope) obj).code);
    }

    @NonNull
    public String getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public String toString() {
        return "Scope{code='" + this.code + "'}";
    }
}
