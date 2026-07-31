package androidx.room;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX WARN: Method from annotation default annotation not found: enums */
/* JADX WARN: Method from annotation default annotation not found: uuid */
/* compiled from: BuiltInTypeConverters.kt */
@Target({})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/room/BuiltInTypeConverters;", "", "Landroidx/room/BuiltInTypeConverters$State;", "enums", CommonUrlParts.UUID, "<init>", "(Landroidx/room/BuiltInTypeConverters$State;Landroidx/room/BuiltInTypeConverters$State;)V", "State", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface BuiltInTypeConverters {

    /* compiled from: BuiltInTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/BuiltInTypeConverters$State;", "", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "INHERITED", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        ENABLED,
        DISABLED,
        INHERITED
    }
}
