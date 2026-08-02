package com.squareup.thing;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.cash.ui.UiContainer;
import kotlin.Metadata;

/* loaded from: classes.dex */
public final class Thing {
    public static final Thing EDIT_MODE_THING = new Thing(null, null);
    public final Object result;
    public final UiContainer rootContainer;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/squareup/thing/Thing$Companion", "", "Landroid/content/Context;", "context", "forTest", "(Landroid/content/Context;)Landroid/content/Context;", "Lcom/squareup/thing/Thing;", "EDIT_MODE_THING", "Lcom/squareup/thing/Thing;", "thing"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static Thing thing(View view) {
            view.getClass();
            Object context = view.getContext();
            context.getClass();
            while (!(context instanceof HasThing) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
            return ((HasThing) context).getThing();
        }

        public final Context forTest(Context context) {
            return new ThingContextWrapper(context, Thing.EDIT_MODE_THING);
        }
    }

    public interface HasThing {
        Thing getThing();
    }

    public final class ThingContextThemeWrapper extends ContextThemeWrapper implements HasThing {
        public final Thing thing;

        public ThingContextThemeWrapper(AppCompatActivity appCompatActivity, int i, Thing thing) {
            super(appCompatActivity, i);
            this.thing = thing;
        }

        @Override // com.squareup.thing.Thing.HasThing
        public final Thing getThing() {
            return this.thing;
        }
    }

    public final class ThingContextWrapper extends ContextWrapper implements HasThing {
        public LayoutInflater inflater;
        public final Thing thing;

        public ThingContextWrapper(Context context, Thing thing) {
            super(context);
            this.thing = thing;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            str.getClass();
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.inflater == null) {
                this.inflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.inflater;
        }

        @Override // com.squareup.thing.Thing.HasThing
        public final Thing getThing() {
            return this.thing;
        }
    }

    public Thing(UiContainer uiContainer, Object obj) {
        this.rootContainer = uiContainer;
        this.result = obj;
    }
}
