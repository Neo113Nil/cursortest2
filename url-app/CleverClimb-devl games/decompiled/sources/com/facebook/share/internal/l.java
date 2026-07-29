package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.internal.ab;
import com.facebook.internal.e;
import com.facebook.internal.v;
import com.facebook.internal.w;
import com.facebook.share.a;
import com.facebook.share.internal.g;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShareInternalUtility.java */
/* loaded from: classes.dex */
public final class l {
    public static String a(Bundle bundle) {
        if (bundle.containsKey("completionGesture")) {
            return bundle.getString("completionGesture");
        }
        return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    public static String b(Bundle bundle) {
        if (bundle.containsKey("postId")) {
            return bundle.getString("postId");
        }
        if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
            return bundle.getString("com.facebook.platform.extra.POST_ID");
        }
        return bundle.getString("post_id");
    }

    public static boolean a(int i, int i2, Intent intent, i iVar) {
        com.facebook.internal.a a2 = a(i, i2, intent);
        if (a2 == null) {
            return false;
        }
        v.a(a2.c());
        if (iVar == null) {
            return true;
        }
        com.facebook.j a3 = w.a(w.g(intent));
        if (a3 != null) {
            if (a3 instanceof com.facebook.k) {
                iVar.a(a2);
            } else {
                iVar.a(a2, a3);
            }
        } else {
            iVar.a(a2, w.e(intent));
        }
        return true;
    }

    public static i a(final com.facebook.h<a.C0363a> hVar) {
        return new i(hVar) { // from class: com.facebook.share.internal.l.1
            @Override // com.facebook.share.internal.i
            public void a(com.facebook.internal.a aVar, Bundle bundle) {
                if (bundle != null) {
                    String a2 = l.a(bundle);
                    if (a2 == null || "post".equalsIgnoreCase(a2)) {
                        l.a((com.facebook.h<a.C0363a>) hVar, l.b(bundle));
                    } else if ("cancel".equalsIgnoreCase(a2)) {
                        l.b((com.facebook.h<a.C0363a>) hVar);
                    } else {
                        l.a((com.facebook.h<a.C0363a>) hVar, new com.facebook.j("UnknownError"));
                    }
                }
            }

            @Override // com.facebook.share.internal.i
            public void a(com.facebook.internal.a aVar) {
                l.b((com.facebook.h<a.C0363a>) hVar);
            }

            @Override // com.facebook.share.internal.i
            public void a(com.facebook.internal.a aVar, com.facebook.j jVar) {
                l.a((com.facebook.h<a.C0363a>) hVar, jVar);
            }
        };
    }

    private static com.facebook.internal.a a(int i, int i2, Intent intent) {
        UUID b2 = w.b(intent);
        if (b2 == null) {
            return null;
        }
        return com.facebook.internal.a.a(b2, i);
    }

    public static void a(final int i) {
        com.facebook.internal.e.a(i, new e.a() { // from class: com.facebook.share.internal.l.2
            @Override // com.facebook.internal.e.a
            public boolean a(int i2, Intent intent) {
                return l.a(i, i2, intent, l.a((com.facebook.h<a.C0363a>) null));
            }
        });
    }

    public static void a(final int i, com.facebook.e eVar, final com.facebook.h<a.C0363a> hVar) {
        if (!(eVar instanceof com.facebook.internal.e)) {
            throw new com.facebook.j("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.e) eVar).b(i, new e.a() { // from class: com.facebook.share.internal.l.3
            @Override // com.facebook.internal.e.a
            public boolean a(int i2, Intent intent) {
                return l.a(i, i2, intent, l.a((com.facebook.h<a.C0363a>) hVar));
            }
        });
    }

    public static List<String> a(SharePhotoContent sharePhotoContent, final UUID uuid) {
        List<SharePhoto> photos;
        if (sharePhotoContent == null || (photos = sharePhotoContent.getPhotos()) == null) {
            return null;
        }
        List a2 = ab.a((List) photos, (ab.d) new ab.d<SharePhoto, v.a>() { // from class: com.facebook.share.internal.l.4
            @Override // com.facebook.internal.ab.d
            public v.a a(SharePhoto sharePhoto) {
                return l.b(uuid, sharePhoto);
            }
        });
        List<String> a3 = ab.a(a2, (ab.d) new ab.d<v.a, String>() { // from class: com.facebook.share.internal.l.5
            @Override // com.facebook.internal.ab.d
            public String a(v.a aVar) {
                return aVar.a();
            }
        });
        v.a(a2);
        return a3;
    }

    public static String a(ShareVideoContent shareVideoContent, UUID uuid) {
        if (shareVideoContent == null || shareVideoContent.getVideo() == null) {
            return null;
        }
        v.a a2 = v.a(uuid, shareVideoContent.getVideo().getLocalUrl());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a2);
        v.a(arrayList);
        return a2.a();
    }

    public static List<Bundle> a(ShareMediaContent shareMediaContent, final UUID uuid) {
        List<ShareMedia> media;
        if (shareMediaContent == null || (media = shareMediaContent.getMedia()) == null) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        List<Bundle> a2 = ab.a((List) media, (ab.d) new ab.d<ShareMedia, Bundle>() { // from class: com.facebook.share.internal.l.6
            @Override // com.facebook.internal.ab.d
            public Bundle a(ShareMedia shareMedia) {
                v.a b2 = l.b(uuid, shareMedia);
                arrayList.add(b2);
                Bundle bundle = new Bundle();
                bundle.putString("type", shareMedia.getMediaType().name());
                bundle.putString("uri", b2.a());
                return bundle;
            }
        });
        v.a(arrayList);
        return a2;
    }

    public static JSONObject a(final UUID uuid, ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        ShareOpenGraphAction action = shareOpenGraphContent.getAction();
        final ArrayList arrayList = new ArrayList();
        JSONObject a2 = g.a(action, new g.a() { // from class: com.facebook.share.internal.l.7
            @Override // com.facebook.share.internal.g.a
            public JSONObject a(SharePhoto sharePhoto) {
                v.a b2 = l.b(uuid, sharePhoto);
                if (b2 == null) {
                    return null;
                }
                arrayList.add(b2);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", b2.a());
                    if (sharePhoto.getUserGenerated()) {
                        jSONObject.put("user_generated", true);
                    }
                    return jSONObject;
                } catch (JSONException e) {
                    throw new com.facebook.j("Unable to attach images", e);
                }
            }
        });
        v.a(arrayList);
        if (shareOpenGraphContent.getPlaceId() != null && ab.a(a2.optString("place"))) {
            a2.put("place", shareOpenGraphContent.getPlaceId());
        }
        if (shareOpenGraphContent.getPeopleIds() != null) {
            JSONArray optJSONArray = a2.optJSONArray("tags");
            Set hashSet = optJSONArray == null ? new HashSet() : ab.b(optJSONArray);
            Iterator<String> it = shareOpenGraphContent.getPeopleIds().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            a2.put("tags", new ArrayList(hashSet));
        }
        return a2;
    }

    public static JSONObject a(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return g.a(shareOpenGraphContent.getAction(), new g.a() { // from class: com.facebook.share.internal.l.8
            @Override // com.facebook.share.internal.g.a
            public JSONObject a(SharePhoto sharePhoto) {
                Uri imageUrl = sharePhoto.getImageUrl();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", imageUrl.toString());
                    return jSONObject;
                } catch (JSONException e) {
                    throw new com.facebook.j("Unable to attach images", e);
                }
            }
        });
    }

    public static JSONArray a(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    public static JSONObject a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj, true);
                }
                Pair<String, String> a2 = a(string);
                String str = (String) a2.first;
                String str2 = (String) a2.second;
                if (z) {
                    if (str != null && str.equals("fbsdk")) {
                        jSONObject2.put(string, obj);
                    } else {
                        if (str != null && !str.equals("og")) {
                            jSONObject3.put(str2, obj);
                        }
                        jSONObject2.put(str2, obj);
                    }
                } else if (str != null && str.equals("fb")) {
                    jSONObject2.put(string, obj);
                } else {
                    jSONObject2.put(str2, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new com.facebook.j("Failed to create json object from share content");
        }
    }

    public static Pair<String, String> a(String str) {
        String str2;
        int i;
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
            str2 = null;
        } else {
            str2 = str.substring(0, indexOf);
            str = str.substring(i);
        }
        return new Pair<>(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.a b(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.getBitmap();
            uri = sharePhoto.getImageUrl();
        } else if (shareMedia instanceof ShareVideo) {
            uri = ((ShareVideo) shareMedia).getLocalUrl();
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        if (bitmap != null) {
            return v.a(uuid, bitmap);
        }
        if (uri != null) {
            return v.a(uuid, uri);
        }
        return null;
    }

    static void b(com.facebook.h<a.C0363a> hVar) {
        a("cancelled", (String) null);
        if (hVar != null) {
            hVar.a();
        }
    }

    static void a(com.facebook.h<a.C0363a> hVar, String str) {
        a("succeeded", (String) null);
        if (hVar != null) {
            hVar.a((com.facebook.h<a.C0363a>) new a.C0363a(str));
        }
    }

    static void a(com.facebook.h<a.C0363a> hVar, com.facebook.j jVar) {
        a("error", jVar.getMessage());
        if (hVar != null) {
            hVar.a(jVar);
        }
    }

    private static void a(String str, String str2) {
        com.facebook.appevents.f c2 = com.facebook.appevents.f.c(com.facebook.l.f());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        c2.a("fb_share_dialog_result", (Double) null, bundle);
    }
}
