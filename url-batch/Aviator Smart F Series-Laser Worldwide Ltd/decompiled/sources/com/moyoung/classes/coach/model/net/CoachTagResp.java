package com.moyoung.classes.coach.model.net;

import java.util.List;

/* loaded from: classes4.dex */
public class CoachTagResp {
    private List<Coach> coach;
    private int id;
    private String name;
    private List<Language> name_language;
    private String picture;
    private int sequence;
    private int status;

    public static class Coach {
        private int cal_length;
        private int id;
        private int level;
        private String name;
        private List<Language> name_language;
        private int sequence;
        private int status;
        private String thumbnail;
        private int total_time;

        public int getCal_length() {
            return this.cal_length;
        }

        public int getId() {
            return this.id;
        }

        public int getLevel() {
            return this.level;
        }

        public String getName() {
            return this.name;
        }

        public List<Language> getName_language() {
            return this.name_language;
        }

        public int getSequence() {
            return this.sequence;
        }

        public int getStatus() {
            return this.status;
        }

        public String getThumbnail() {
            return this.thumbnail;
        }

        public int getTotal_time() {
            return this.total_time;
        }
    }

    public static class Language {
        private String code;
        private String translate;
    }

    public List<Coach> getCoach() {
        return this.coach;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Language> getName_language() {
        return this.name_language;
    }

    public String getPicture() {
        return this.picture;
    }

    public int getSequence() {
        return this.sequence;
    }

    public int getStatus() {
        return this.status;
    }
}
