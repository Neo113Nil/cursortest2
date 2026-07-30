package com.moyoung.dafit.module.common.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class GifImageView extends View {
    private Context context;
    private int duration;
    private boolean isStarted;
    private Movie movie;
    private long movieStart;
    private final Paint paint;

    public GifImageView(Context context) {
        super(context);
        this.movie = null;
        this.movieStart = 0L;
        this.isStarted = false;
        this.duration = 0;
        this.paint = new Paint();
        init(context);
    }

    private InputStream getFromRaw(int i8) {
        Context context = this.context;
        if (context != null && context.getResources() != null) {
            try {
                return this.context.getResources().openRawResource(i8);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    private void init(Context context) {
        this.context = context;
        setLayerType(1, this.paint);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Movie movie = this.movie;
        if (!this.isStarted || movie == null) {
            return;
        }
        movie.setTime(Math.round(SystemClock.elapsedRealtime() - this.movieStart) % this.duration);
        movie.draw(canvas, ((getWidth() - movie.width()) * 1.0f) / 2.0f, ((getHeight() - movie.height()) * 1.0f) / 2.0f);
        invalidate();
    }

    public void setGifResource(int i8) {
        InputStream fromRaw = getFromRaw(i8);
        if (fromRaw != null) {
            setGifResource(fromRaw);
        }
    }

    public void start() {
        if (this.movie != null) {
            this.movieStart = SystemClock.elapsedRealtime();
            this.isStarted = true;
            invalidate();
        }
    }

    public void stop() {
        if (this.movie != null) {
            this.movieStart = 0L;
            this.isStarted = false;
            invalidate();
        }
    }

    private void setGifResource(InputStream inputStream) {
        try {
            Movie decodeStream = Movie.decodeStream(inputStream);
            this.movie = decodeStream;
            this.duration = decodeStream.duration();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public GifImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.movie = null;
        this.movieStart = 0L;
        this.isStarted = false;
        this.duration = 0;
        this.paint = new Paint();
        init(context);
    }

    public GifImageView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.movie = null;
        this.movieStart = 0L;
        this.isStarted = false;
        this.duration = 0;
        this.paint = new Paint();
        init(context);
    }
}
