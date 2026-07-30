package com.moyoung.classes.coach.model.net;

import com.moyoung.classes.ClassesLanguageBean;
import java.util.List;

/* loaded from: classes4.dex */
public class RelatedCourseResp {
    private int id;
    private int level;
    private String name;
    private List<ClassesLanguageBean> name_language;
    private String picture;
    private String thumbnail;
    private int total_time;

    public int getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public List<ClassesLanguageBean> getName_language() {
        return this.name_language;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public int getTotal_time() {
        return this.total_time;
    }
}
