package net.oneformapp.schema;

import android.content.Context;

/* loaded from: classes4.dex */
public final class Schema_ extends Schema {
    public static Schema_ instance_;

    public static Schema_ getInstance_(Context context) {
        if (instance_ == null) {
            Context applicationContext = context.getApplicationContext();
            Schema_ schema_ = new Schema_();
            instance_ = schema_;
            if (!schema_.mLoaded) {
                schema_.mLoaded = true;
                schema_.forceLoadSchema(applicationContext);
            }
        }
        return instance_;
    }
}
