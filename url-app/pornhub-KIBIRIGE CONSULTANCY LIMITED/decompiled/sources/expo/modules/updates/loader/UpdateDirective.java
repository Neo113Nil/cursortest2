package expo.modules.updates.loader;

import com.caverock.androidsvg.SVGParser;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.UpdatesUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RemoteUpdate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0003\b\t\nB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lexpo/modules/updates/loader/UpdateDirective;", "", "signingInfo", "Lexpo/modules/updates/loader/SigningInfo;", "<init>", "(Lexpo/modules/updates/loader/SigningInfo;)V", "getSigningInfo", "()Lexpo/modules/updates/loader/SigningInfo;", "NoUpdateAvailableUpdateDirective", "RollBackToEmbeddedUpdateDirective", "Companion", "Lexpo/modules/updates/loader/UpdateDirective$NoUpdateAvailableUpdateDirective;", "Lexpo/modules/updates/loader/UpdateDirective$RollBackToEmbeddedUpdateDirective;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class UpdateDirective {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SigningInfo signingInfo;

    public /* synthetic */ UpdateDirective(SigningInfo signingInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(signingInfo);
    }

    /* compiled from: RemoteUpdate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/updates/loader/UpdateDirective$NoUpdateAvailableUpdateDirective;", "Lexpo/modules/updates/loader/UpdateDirective;", "signingInfo", "Lexpo/modules/updates/loader/SigningInfo;", "<init>", "(Lexpo/modules/updates/loader/SigningInfo;)V", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoUpdateAvailableUpdateDirective extends UpdateDirective {
        public NoUpdateAvailableUpdateDirective(SigningInfo signingInfo) {
            super(signingInfo, null);
        }
    }

    private UpdateDirective(SigningInfo signingInfo) {
        this.signingInfo = signingInfo;
    }

    public final SigningInfo getSigningInfo() {
        return this.signingInfo;
    }

    /* compiled from: RemoteUpdate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/updates/loader/UpdateDirective$RollBackToEmbeddedUpdateDirective;", "Lexpo/modules/updates/loader/UpdateDirective;", "commitTime", "Ljava/util/Date;", "signingInfo", "Lexpo/modules/updates/loader/SigningInfo;", "<init>", "(Ljava/util/Date;Lexpo/modules/updates/loader/SigningInfo;)V", "getCommitTime", "()Ljava/util/Date;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RollBackToEmbeddedUpdateDirective extends UpdateDirective {
        private final Date commitTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RollBackToEmbeddedUpdateDirective(Date commitTime, SigningInfo signingInfo) {
            super(signingInfo, null);
            Intrinsics.checkNotNullParameter(commitTime, "commitTime");
            this.commitTime = commitTime;
        }

        public final Date getCommitTime() {
            return this.commitTime;
        }
    }

    /* compiled from: RemoteUpdate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/loader/UpdateDirective$Companion;", "", "<init>", "()V", "fromJSONString", "Lexpo/modules/updates/loader/UpdateDirective;", "jsonString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UpdateDirective fromJSONString(String jsonString) {
            JSONObject jSONObject;
            String str;
            JSONObject jSONObject2;
            String str2;
            JSONObject jSONObject3;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject4 = new JSONObject(jsonString);
            SigningInfo signingInfo = null;
            if (jSONObject4.has("extra")) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    Object string = jSONObject4.getString("extra");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    jSONObject = (JSONObject) Double.valueOf(jSONObject4.getDouble("extra"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    jSONObject = (JSONObject) Integer.valueOf(jSONObject4.getInt("extra"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    jSONObject = (JSONObject) Long.valueOf(jSONObject4.getLong("extra"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    jSONObject = (JSONObject) Boolean.valueOf(jSONObject4.getBoolean("extra"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    Object jSONArray = jSONObject4.getJSONArray("extra");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    jSONObject = jSONObject4.getJSONObject("extra");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj = jSONObject4.get("extra");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                if (jSONObject.has("signingInfo")) {
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(JSONObject.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                        Object string2 = jSONObject.getString("signingInfo");
                        if (string2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject3 = (JSONObject) string2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        jSONObject3 = (JSONObject) Double.valueOf(jSONObject.getDouble("signingInfo"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        jSONObject3 = (JSONObject) Integer.valueOf(jSONObject.getInt("signingInfo"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        jSONObject3 = (JSONObject) Long.valueOf(jSONObject.getLong("signingInfo"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        jSONObject3 = (JSONObject) Boolean.valueOf(jSONObject.getBoolean("signingInfo"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                        Object jSONArray2 = jSONObject.getJSONArray("signingInfo");
                        if (jSONArray2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject3 = (JSONObject) jSONArray2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                        jSONObject3 = jSONObject.getJSONObject("signingInfo");
                        if (jSONObject3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        Object obj2 = jSONObject.get("signingInfo");
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject3 = (JSONObject) obj2;
                    }
                } else {
                    jSONObject3 = null;
                }
                if (jSONObject3 != null) {
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(String.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(String.class))) {
                        str3 = jSONObject3.getString("projectId");
                        if (str3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        str3 = (String) Double.valueOf(jSONObject3.getDouble("projectId"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        str3 = (String) Integer.valueOf(jSONObject3.getInt("projectId"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        str3 = (String) Long.valueOf(jSONObject3.getLong("projectId"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        str3 = (String) Boolean.valueOf(jSONObject3.getBoolean("projectId"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                        Object jSONArray3 = jSONObject3.getJSONArray("projectId");
                        if (jSONArray3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str3 = (String) jSONArray3;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                        Object jSONObject5 = jSONObject3.getJSONObject("projectId");
                        if (jSONObject5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str3 = (String) jSONObject5;
                    } else {
                        Object obj3 = jSONObject3.get("projectId");
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str3 = (String) obj3;
                    }
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(String.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(String.class))) {
                        str4 = jSONObject3.getString(UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY);
                        if (str4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        str4 = (String) Double.valueOf(jSONObject3.getDouble(UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        str4 = (String) Integer.valueOf(jSONObject3.getInt(UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        str4 = (String) Long.valueOf(jSONObject3.getLong(UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        str4 = (String) Boolean.valueOf(jSONObject3.getBoolean(UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                        Object jSONArray4 = jSONObject3.getJSONArray(UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY);
                        if (jSONArray4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str4 = (String) jSONArray4;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                        Object jSONObject6 = jSONObject3.getJSONObject(UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY);
                        if (jSONObject6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str4 = (String) jSONObject6;
                    } else {
                        Object obj4 = jSONObject3.get(UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY);
                        if (obj4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str4 = (String) obj4;
                    }
                    signingInfo = new SigningInfo(str3, str4);
                }
            }
            KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(String.class);
            if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(String.class))) {
                str = jSONObject4.getString(SVGParser.XML_STYLESHEET_ATTR_TYPE);
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                str = (String) Double.valueOf(jSONObject4.getDouble(SVGParser.XML_STYLESHEET_ATTR_TYPE));
            } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                str = (String) Integer.valueOf(jSONObject4.getInt(SVGParser.XML_STYLESHEET_ATTR_TYPE));
            } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                str = (String) Long.valueOf(jSONObject4.getLong(SVGParser.XML_STYLESHEET_ATTR_TYPE));
            } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                str = (String) Boolean.valueOf(jSONObject4.getBoolean(SVGParser.XML_STYLESHEET_ATTR_TYPE));
            } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray5 = jSONObject4.getJSONArray(SVGParser.XML_STYLESHEET_ATTR_TYPE);
                if (jSONArray5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) jSONArray5;
            } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject7 = jSONObject4.getJSONObject(SVGParser.XML_STYLESHEET_ATTR_TYPE);
                if (jSONObject7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) jSONObject7;
            } else {
                Object obj5 = jSONObject4.get(SVGParser.XML_STYLESHEET_ATTR_TYPE);
                if (obj5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) obj5;
            }
            if (Intrinsics.areEqual(str, "noUpdateAvailable")) {
                return new NoUpdateAvailableUpdateDirective(signingInfo);
            }
            if (!Intrinsics.areEqual(str, "rollBackToEmbedded")) {
                throw new Error("Invalid message messageType: " + str);
            }
            UpdatesUtils updatesUtils = UpdatesUtils.INSTANCE;
            KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string3 = jSONObject4.getString("parameters");
                if (string3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) string3;
            } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject2 = (JSONObject) Double.valueOf(jSONObject4.getDouble("parameters"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject2 = (JSONObject) Integer.valueOf(jSONObject4.getInt("parameters"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject2 = (JSONObject) Long.valueOf(jSONObject4.getLong("parameters"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject2 = (JSONObject) Boolean.valueOf(jSONObject4.getBoolean("parameters"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray6 = jSONObject4.getJSONArray("parameters");
                if (jSONArray6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) jSONArray6;
            } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject2 = jSONObject4.getJSONObject("parameters");
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj6 = jSONObject4.get("parameters");
                if (obj6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) obj6;
            }
            KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(String.class);
            if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(String.class))) {
                str2 = jSONObject2.getString("commitTime");
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                str2 = (String) Double.valueOf(jSONObject2.getDouble("commitTime"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                str2 = (String) Integer.valueOf(jSONObject2.getInt("commitTime"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                str2 = (String) Long.valueOf(jSONObject2.getLong("commitTime"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                str2 = (String) Boolean.valueOf(jSONObject2.getBoolean("commitTime"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray7 = jSONObject2.getJSONArray("commitTime");
                if (jSONArray7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str2 = (String) jSONArray7;
            } else if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject8 = jSONObject2.getJSONObject("commitTime");
                if (jSONObject8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str2 = (String) jSONObject8;
            } else {
                Object obj7 = jSONObject2.get("commitTime");
                if (obj7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str2 = (String) obj7;
            }
            return new RollBackToEmbeddedUpdateDirective(updatesUtils.parseDateString(str2), signingInfo);
        }
    }
}
